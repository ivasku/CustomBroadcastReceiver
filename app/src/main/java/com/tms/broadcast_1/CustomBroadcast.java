package com.tms.broadcast_1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class CustomBroadcast extends BroadcastReceiver {
    private static String TAG = "CustomBroadcast";
    private String customAction = "com.tms.example_action";

    @Override
    public void onReceive(Context context, Intent intent) {

        if (customAction.equals(intent.getAction())) {
            Log.d(TAG, "onReceive: Custom Action");


            String receivedText = intent.getStringExtra("com.tms.extra_text");
            Toast.makeText(context, "Custom Action " + receivedText , Toast.LENGTH_LONG).show();
        }


    }
}
