package com.tms.broadcast_1;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CustomBroadcast customBroadcast = new CustomBroadcast(); // dynamic receiver

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //we send this broadcast with extra string from another app
        IntentFilter filter = new IntentFilter("com.tms.example_action");
        registerReceiver(customBroadcast, filter);
    }

    @Override
    protected void onStart() {
        super.onStart();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //unregister receiver
        unregisterReceiver(customBroadcast);
    }

}
