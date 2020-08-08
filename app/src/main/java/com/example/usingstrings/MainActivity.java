package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txt = findViewById(R.id.textView2);
        txt.setText(R.string.Msg2);

        Log.i("lifecycle","onCreated() called");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("lifeCycle","onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("lifecycle","onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("lifecycle","onPaused() called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("lifecycle","onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("lifecycle","onDestroy() called");
    }
}