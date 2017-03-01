package com.example.threadsexample;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Handler handler = new Handler(){

            @Override
            public void handleMessage(Message msg) {
                //super.handleMessage(msg);
                TextView myTextView = (TextView)findViewById(R.id.textView);
                myTextView.setText("Button Pressed");
            }
        };

        Button btn_backGroundTask = (Button) findViewById(R.id.btn_bckTask);
        btn_backGroundTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //block ui thread for 20 seconds so we have to do this task in separate thread
                /*long endTime = System.currentTimeMillis() + 20*1000;

                while (System.currentTimeMillis() < endTime) {
                    synchronized (this) {
                        try {
                            Thread.sleep(endTime - System.currentTimeMillis());
                            //wait(endTime - System.currentTimeMillis());
                        } catch (Exception e) {
                        }
                    }
                }*/
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        long endTime = System.currentTimeMillis() + 20*1000;

                        while (System.currentTimeMillis() < endTime) {
                            synchronized (this) {
                                try {
                                    Thread.sleep(endTime - System.currentTimeMillis());
                                    //wait(endTime - System.currentTimeMillis());
                                } catch (Exception e) {
                                }
                            }
                        }
                        handler.sendEmptyMessage(0);
                    }
                }).start();
            }
        });
    }
}
