package dru.kittapat.myrestaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by WINDOWS8.1.1 on 12-Dec-15.
 */
class MyOpenHelper extends SQLiteOpenHelper{

    //Explicit
    private static final String DATABASE_NAME ="Restaurant.db";
    private static final  int DATABASE_VERSION = 1;
    private static final  String CREATE_TABLE_USER = "create table userTABLE (" +
            "_id integer primary key," +
            "User text," +
            "Password text," +
            "name text);";
    private static final String CREATE_TABLE_FOOD = "create table foodTABLE (" +
            "_id integer primary key," +
            "Food text," +
            "Source text," +
            "Price text);";

    public MyOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }//Constructor

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_USER);
        db.execSQL(CREATE_TABLE_FOOD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}//Main Class
