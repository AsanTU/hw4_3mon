package com.example.hw4_3mon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hw4_3mon.CONTINENT.FirstFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new FirstFragment()).commit();
    }
}