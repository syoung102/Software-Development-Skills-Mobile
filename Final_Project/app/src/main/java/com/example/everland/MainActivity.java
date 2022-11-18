package com.example.everland;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);

        Button infoBtn = (Button) findViewById(R.id.infoBtn);
        infoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent infoIntent = new Intent(getApplicationContext(), InfoActivity.class);
                startActivity(infoIntent);
            }
        });

        Button websiteBtn = (Button)findViewById(R.id.websiteBtn);
        websiteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String everland = "http://www.everland.com";
                Uri webpage = Uri.parse(everland);

                Intent gotoEverland = new Intent(Intent.ACTION_VIEW, webpage);
                if (gotoEverland.resolveActivity(getPackageManager()) != null){
                    startActivity(gotoEverland);
                }
            }
        });
    }
}