package cl.telematica.android.certamen3v2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jc on 25-11-2016.
 */

public class DataBaseClass  extends SQLiteOpenHelper {

    private String sqlString = "CREATE TABLE scores ( name TEXT, score INTEGER)";
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "ScoresDB";
    public DataBaseClass(Context ctx){
        super(ctx, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(sqlString);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS scores");
        onCreate(db);
    }
}