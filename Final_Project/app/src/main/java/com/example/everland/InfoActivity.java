package com.example.everland;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {

    ListView infoListView;
    String[] rides;
    int[] people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Resources res = getResources();
        infoListView = (ListView) findViewById(R.id.infoListView);
        rides = res.getStringArray(R.array.rides);
        people = res.getIntArray(R.array.people);

        InfoAdapter infoAdapter = new InfoAdapter(this, rides, people);
        infoListView.setAdapter(infoAdapter);

        infoListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent showDetailActivity =
                        new Intent(getApplicationContext(), DetailActivity.class);
                showDetailActivity.putExtra("com.example.RIDE_INDEX", i);
                startActivity(showDetailActivity);
            }
        });
    }
}