package cl.telematica.android.certamen3v2.interfaces;

import java.util.List;

import cl.telematica.android.certamen3v2.models.ScoreModel;

/**
 * Created by Jc on 25-11-2016.
 */

public interface RankingInteractor {
    public List<ScoreModel> dbGetScores();
}
