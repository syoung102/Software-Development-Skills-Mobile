package com.example.everland;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.widget.ImageView;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ImageView img = (ImageView) findViewById(R.id.logoEverland);
        scaleImg(img);
        Loadingstart();
    }

    private void scaleImg(ImageView img){
        // give us access to the screen
        Display screen = getWindowManager().getDefaultDisplay();
        // give us access to some Java library, class
        BitmapFactory.Options options = new BitmapFactory.Options();

        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), R.drawable.logoeverland, options);

        int imgWidth = options.outWidth;
        int screenWidth = screen.getWidth();

        int ratio = Math.round((float)imgWidth / (float)screenWidth);
        options.inSampleSize = ratio+2;


        options.inJustDecodeBounds = false;
        Bitmap scaledImg = BitmapFactory.decodeResource(getResources(), R.drawable.logoeverland, options);
        img.setImageBitmap(scaledImg);
    }

    private void Loadingstart(){
        Handler handler=new Handler();
        handler.postDelayed(new Runnable(){
            public void run(){
                finish();
            }
        },2000);
    }
}