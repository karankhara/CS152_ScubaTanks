package com.example.karan.scubadive;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Search for "TODO", and make the appropriate changes.
public class DBAdapter2 extends  SQLiteOpenHelper {

    public static final String DATABASE_NAME = "MyDBName.db";
    public static final String DATABASE_TABLE_NAME = "dive_table";
    public static final String DATABASE_COLUMN_ID = "id";
    public static final String DATABASE_COLUMN_DEPTH = "depth";
    public static final String DATABASE_COLUMN_BOTTOM_TIME = "bottom_time";
    public static final String DATABASE_COLUMN_PRESSURE_GROUP = "pressure_group";

    public static final int COLUMN_ROW_ID = 0;
    public static final int COLUMN_DEPTH = 1;
    public static final int COLUMN_BOTTOM_TIME = 2;
    public static final int COLUMN_PRESSURE_GROUP = 3;

    private HashMap hp;

    public DBAdapter2(Context context)
    {
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(
                "create table dive_table " +
                        "(id integer primary key, depth text,bottom_time text,pressure_group text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS dive_table");
        onCreate(db);
    }

    public boolean insertRow(Dive dive)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("depth", dive.getDepth());
        contentValues.put("bottom_time", dive.getTime());
        contentValues.put("pressure_group", dive.getPressure());

        db.insert("dive_table", null, contentValues);
        return true;
    }
    public Cursor getData(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from dive_table where id="+id+"", null );
        return res;
    }
    public String getGroup(String Depth, String bot_time){
        String str = null;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select pressure_group from dive_table where depth="+Depth+" AND bottom_time="+bot_time+"", null );
        //System.out.println("press group is--> "+res.getString());

        if (res.moveToFirst()) {
            str = res.getString(res.getColumnIndex("pressure_group"));
            System.out.println("press group is--> "+str);
        }
        return str;
    }
    public int numberOfRows(){
        SQLiteDatabase db = this.getReadableDatabase();
        int numRows = (int) DatabaseUtils.queryNumEntries(db, DATABASE_TABLE_NAME);
        return numRows;
    }
    public boolean updateRow(Dive dive)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("depth", dive.getDepth());
        contentValues.put("bottom_time", dive.getTime());
        contentValues.put("pressure_group", dive.getPressure());
        db.update("dive_table", contentValues, "id = ? ", new String[] { Integer.toString(dive.getID()) } );
        return true;
    }

    public Integer deleteRow (Integer id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("contacts",
                "id = ? ",
                new String[] { Integer.toString(id) });
    }
    public ArrayList getAllRows()
    {
        ArrayList array_list = new ArrayList();
        //hp = new HashMap();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from dive_table", null );
        res.moveToFirst();
        while(res.isAfterLast() == false){
            array_list.add(res.getString(res.getColumnIndex(DATABASE_COLUMN_PRESSURE_GROUP)));
            res.moveToNext();
        }

        System.out.println("all rows are:: \n"+array_list );
        return array_list;
    }
}