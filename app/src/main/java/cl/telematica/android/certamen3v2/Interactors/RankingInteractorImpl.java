package cl.telematica.android.certamen3v2.Interactors;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;

import cl.telematica.android.certamen3v2.models.ScoreModel;

/**
 * Created by Jc on 25-11-2016.
 */

public class RankingInteractorImpl {
    Context context;
    public DatabaseInteractor db;

    public RankingInteractorImpl ( Context context ) {
        this.context = context;
        db = new DatabaseInteractor(context);
    }
    public ArrayList<ScoreModel> dbGetScores(){
        int i = 0;
        ArrayList<ScoreModel> scoreModelList = new ArrayList<ScoreModel>();
        Cursor dbCursor = db.getTable();
        if (dbCursor.moveToFirst()){
            do {
                scoreModelList.add(new ScoreModel(dbCursor.getString(0), dbCursor.getInt(1)));
            }
            while (dbCursor.moveToNext());
        }
        dbCursor.close();
        return scoreModelList;
    }
}
