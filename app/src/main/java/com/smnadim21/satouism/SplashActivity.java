package com.smnadim21.satouism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.smnadim21.api.BdApps;
import com.smnadim21.api.Constants;

import static com.smnadim21.api.BdApps.checkSubStatus;
import static com.smnadim21.api.Subscription.getSubCode;


public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Constants.MSG_TEXT = "start whatever!";
        Constants.APP_ID = "APP_ID_123456";
        Constants.APP_PASSWORD = "Write Your App Password!";

        BdApps.checkSubStatus();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this,ItemListActivity.class));
                finish();
            }
        },2000);






    }
}
