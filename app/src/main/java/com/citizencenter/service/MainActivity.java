package com.citizencenter.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        findViewById(R.id.startService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startService(new Intent(MainActivity.this,MyService.class));
            }
        });

        findViewById(R.id.stopService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                stopService(new Intent(MainActivity.this,MyService.class));
            }
        });
    }
}
