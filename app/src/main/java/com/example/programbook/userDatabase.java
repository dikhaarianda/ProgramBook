package com.example.programbook;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class userDatabase extends SQLiteOpenHelper {

    // database initialization
    public static final String databaseName = "userDB";
    public static final String tableName = "userTable";
    private static final int databaseVersion = 1;

    // database table field
    public static final String col_1 = "ID";
    public static final String col_2 = "name";
    public static final String col_3 = "username";
    public static final String col_4 = "email";
    public static final String col_5 = "password";

    public userDatabase(Context context){
        super(context, databaseName, null, databaseVersion);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
      sqLiteDatabase.execSQL("create table userTable (id integer primary key autoincrement,"
              + "name text,"
              + "username text,"
              + "email text,"
              + "password text);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ tableName);
        onCreate(sqLiteDatabase);
    }

    // add data function
    public boolean addData(String name, String username, String email, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col_2,name);
        contentValues.put(col_3,username);
        contentValues.put(col_4,email);
        contentValues.put(col_5,password);

        long result = db.insert(tableName, null, contentValues);

        if(result == -1)
            return false;
        else
            return true;
    }

    // get data function
    public Cursor getData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from student_table", null);
        return res;
    }

    // update data function
    public boolean updateData(String id,String name,String username,String email,String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col_1,id);
        contentValues.put(col_2,name);
        contentValues.put(col_3,username);
        contentValues.put(col_4,email);
        contentValues.put(col_4,password);
        db.update(tableName,contentValues,"ID = ?",new String[] {id});
        return true;
    }

    // delete data function
    public int deleteData (String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(tableName, "ID = ?", new String[] {id});
    }

}
