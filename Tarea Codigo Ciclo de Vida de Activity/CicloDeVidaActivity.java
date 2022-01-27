package com.clase.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onStart(){
        super.onStart();
        Log.d("onStart","Funciona");
    }

    protected void onResume(){
        super.onResume();
        Log.d("onResume","Funciona");
    }

    protected void onPause(){
        super.onPause();
        Log.d("onPause","Funciona");
    }

    protected void onStop(){
        super.onStop();
        Log.d("onStop","Funciona");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("onDestroy","Funciona");
    }
}