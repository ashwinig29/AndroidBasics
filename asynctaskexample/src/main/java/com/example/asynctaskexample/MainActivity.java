package com.example.asynctaskexample;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyAsyncTask asyncTask = new MyAsyncTask();
        asyncTask.execute("http://developer.android.com");
        Toast.makeText(MainActivity.this, "onCreate", Toast.LENGTH_LONG).show();

    }

    public class MyAsyncTask extends AsyncTask<String, Void, Integer> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(MainActivity.this, "Let's start!", Toast.LENGTH_LONG).show();
        }

        @Override
        protected Integer doInBackground(String... params) {
            HttpURLConnection connection;
            try {
                //Toast.makeText(MainActivity.this, "Let's start!", Toast.LENGTH_LONG).show();

                Log.e("ashwini123", params[0]);
                connection = (HttpURLConnection) new URL(params[0])
                        .openConnection();
                return connection.getResponseCode();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return -1;
        }

        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
            Toast.makeText(MainActivity.this, "Got the following code: " + integer, Toast.LENGTH_LONG).show();
        }
    }
}
