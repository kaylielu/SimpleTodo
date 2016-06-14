package com.example.kaylie.simpletodo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kaylie on 6/14/16.
 */
public class TodoItemDatabase extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "tasksDatabase";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_TASKS = "tasks";

    public TodoItemDatabase(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){

    }

    @Override
    public void onUpgrade(SQLiteDatabase fb, int oldVersion, int newVersion){

    }
}
