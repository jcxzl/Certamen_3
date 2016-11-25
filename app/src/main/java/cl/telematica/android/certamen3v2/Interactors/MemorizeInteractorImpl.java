package cl.telematica.android.certamen3v2.Interactors;

import android.content.Context;

import cl.telematica.android.certamen3v2.interfaces.MemorizeInteractor;

/**
 * Created by Jc on 25-11-2016.
 */

public class MemorizeInteractorImpl implements MemorizeInteractor {

    Context context;
    public DatabaseInteractor db;

    public MemorizeInteractorImpl ( Context context ) {
        this.context = context;
        db = new DatabaseInteractor(context);
    }
    public void dbInsert(String name, int score){
        this.db.ins(name, score);
    }
}
