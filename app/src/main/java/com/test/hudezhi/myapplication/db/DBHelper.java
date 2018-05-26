package com.test.hudezhi.myapplication.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * created by hudezhi on 2018/5/26
 */

public class DBHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "db_account";
    private static final int VERSION = 1;



    public DBHelper(Context context) {
        super(context, DB_NAME, null, VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
