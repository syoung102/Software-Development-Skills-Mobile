package com.example.quicklauncher;

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

        // Attempts to launch an activity within our own app
        Button secondActivityBtn = (Button) findViewById(R.id.secondActivityBtn);
        // R = Resources
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent: 화면간 데이터 전달
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);

                // show how to pass information to another activity
                startIntent.putExtra("com.example.quicklauncher.SOMETHING", "Hello World!");
                startActivity(startIntent);
            }
        });

        // Attempt to launch an activity outside our app
        Button googleBtn = (Button)findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "http://www.google.com";
                Uri webpage = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webpage);
                if (gotoGoogle.resolveActivity(getPackageManager()) != null){
                    startActivity(gotoGoogle);
                }
            }
        });
    }
}