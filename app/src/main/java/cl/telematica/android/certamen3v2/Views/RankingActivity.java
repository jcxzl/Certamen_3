package cl.telematica.android.certamen3v2.Views;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;

import cl.telematica.android.certamen3v2.Presenters.RankingPresenterImpl;
import cl.telematica.android.certamen3v2.R;
import cl.telematica.android.certamen3v2.models.ScoreModel;

public class RankingActivity extends AppCompatActivity  {

    ListView listView;
    ListAdapter  adapter;
    RankingPresenterImpl rankingPresenter;

    ArrayList<ScoreModel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        listView = (ListView)findViewById(R.id.rankingList);

        rankingPresenter =   new RankingPresenterImpl(RankingActivity.this, getApplicationContext());

        arrayList = rankingPresenter.getList();
        String[] fromColumns = {ContactsContract.Data.DISPLAY_NAME};
        int[] toViews = {android.R.id.text1};
        adapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1,null,fromColumns, toViews, 0);
        listView.setAdapter(adapter);
        listView.add


    }

}
