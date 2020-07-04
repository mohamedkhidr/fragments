package com.example.fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements FragmentA.ClickAction {
    private static final String TAG  = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "I'm onCreate()");
        setContentView(R.layout.activity_main);
        startAFragment();
    }

    private void startAFragment() {
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragmentA);
        Log.v(TAG, "I'm a fragment commit");
        fragmentTransaction.commit();
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.v(TAG, "I'm saveInstance()");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.v(TAG, "I'm onStart()");
    }@Override
    public void onResume() {
        super.onResume();
        Log.v(TAG, "I'm onResume()");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.v(TAG, "I'm onPause()");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.v(TAG, "I'm onStop()");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "I'm onDestroy()");
    }
    @Override
    public void onRestart() {
        super.onRestart();
        Log.v(TAG, "I'm onRestart()");
    }

    @Override
    public void onClick() {
        Log.v(TAG, "I'm clicked !");
    }
}
