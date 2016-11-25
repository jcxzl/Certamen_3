package cl.telematica.android.certamen3v2.Presenters;

import android.content.Context;

import cl.telematica.android.certamen3v2.Interactors.MemorizeInteractorImpl;
import cl.telematica.android.certamen3v2.Views.MemorizeActivity;
import cl.telematica.android.certamen3v2.interfaces.MemorizeInteractor;
import cl.telematica.android.certamen3v2.interfaces.MemorizePresenter;

/**
 * Created by Jc on 25-11-2016.
 */

public class MemorizePresenterImpl implements MemorizePresenter{

    MemorizeInteractor memorizeInteractor;
    MemorizeActivity view;
    Context context;

    public MemorizePresenterImpl(MemorizeActivity view, Context context){
        this.context = context;
        this.view = view;
        this.memorizeInteractor = new MemorizeInteractorImpl(context);
    }

    public void dbInsert(String name, int score){
        memorizeInteractor.dbInsert(name, score);
    }
}
