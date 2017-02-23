package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_sendBRoadcast = (Button)findViewById(R.id.btn_send_broadcast);
        btn_sendBRoadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("localBroadCast");
                intent.putExtra("message", "GOT IT");
                LocalBroadcastManager.getInstance(MainActivity.this).sendBroadcast(intent);
            }
        });

    }

    private BroadcastReceiver localBroadCastReciver = new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(MainActivity.this, ""+intent.getStringExtra("message"), Toast.LENGTH_LONG).show();
        }
    };

    @Override
    protected void onPause() {
        super.onPause();
        LocalBroadcastManager.getInstance(MainActivity.this).unregisterReceiver(localBroadCastReciver);

    }

    @Override
    protected void onResume() {
        super.onResume();
        LocalBroadcastManager.getInstance(MainActivity.this).registerReceiver(localBroadCastReciver,new IntentFilter("localBroadCast"));

    }
}


