package com.firebase.androidchat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler(){

            public void handleMessage(Message msg)
            {
                Intent intent = new Intent(Splash.this, Login.class);
                // TODO Auto-generated method stub
                startActivity(intent);
                finish();
            }

        };
        handler.sendEmptyMessageDelayed(0, 2000);



    }
}
