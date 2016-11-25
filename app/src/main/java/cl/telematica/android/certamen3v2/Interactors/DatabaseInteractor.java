package cl.telematica.android.certamen3v2.Interactors;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import cl.telematica.android.certamen3v2.DataBaseClass;

/**
 * Created by Jc on 25-11-2016.
 */

public class DatabaseInteractor{

    DataBaseClass dbInstance;
    SQLiteDatabase db;

    public  DatabaseInteractor(Context context){
        this.dbInstance = new DataBaseClass(context);
        this.db = dbInstance.getWritableDatabase();
    }


    public void ins(String name, int score){
        db.execSQL("INSERT INTO scores (name, score) VALUES ('" + name + "', '" + score + "')");
    }

    public void close(){
        db.close();
    }

    public Cursor getTable(){
        return db.rawQuery("SELECT name, score FROM scores ORDER BY score DESC", null);
    }

}
