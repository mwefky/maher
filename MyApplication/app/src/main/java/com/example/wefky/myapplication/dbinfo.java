package com.example.wefky.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by wefky on 3/23/2017.
 */

public class dbinfo extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_info = "info";
    public static final String DATABASE_NAME = "pinfo.db";
    private static final String hrate = "HeartRete", bpressure = "BloodPressure",
            CVP="CVP", input="Iput",output="Output",abnormal="Abnormal",id="ID";
    public dbinfo(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_info + " ("
                + id +"INTEGER"
                + hrate + " TEXT,"
                + bpressure+ " TEXT " + CVP + " TEXT " +
                input+ " TEXT " +output+ " TEXT " +abnormal+
                " TEXT " +")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_info);
        onCreate(db);
    }
    public void addDayInfo(Info info){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(id,info.getId());
        values.put(hrate,info.getHeartrate());
        values.put(bpressure,info.getBloodpressure());
        values.put(CVP,info.getCvp());
        values.put(input,info.getInput());
        values.put(output,info.getOutput());
        values.put(abnormal,info.getAbnormal());
        db.insert(TABLE_info, null, values);
        db.close(); // Closing database connection
    }
    public Info getinfo(int i) {
        SQLiteDatabase db = this.getReadableDatabase();
        String select="SELECT * FROM "+ TABLE_info + " WHERE " + id +" = "+ i;
        Cursor cursor=db.rawQuery(select,null);
        if (cursor != null)
            cursor.moveToFirst();

        Info info = new Info(Integer.parseInt(cursor.getString(0)),cursor.getString(1),cursor.getString(2),cursor.getString(3),
                cursor.getString(4),cursor.getString(5),cursor.getString(6));
        // return contact
        return info;
    }

}
