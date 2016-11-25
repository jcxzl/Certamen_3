package cl.telematica.android.certamen3v2.Presenters;

import android.content.Context;

import java.util.ArrayList;

import cl.telematica.android.certamen3v2.Interactors.RankingInteractorImpl;
import cl.telematica.android.certamen3v2.Views.RankingActivity;
import cl.telematica.android.certamen3v2.models.ScoreModel;

/**
 * Created by Jc on 25-11-2016.
 */

public class RankingPresenterImpl {
    Context context;
    RankingActivity view;
    RankingInteractorImpl rankingInteractor;
    public RankingPresenterImpl( RankingActivity view, Context context){
        this.view = view;
        this.context = context;
        rankingInteractor = new RankingInteractorImpl(context);
    }

    public ArrayList<ScoreModel> getList(){
        return rankingInteractor.dbGetScores();
    }
}

