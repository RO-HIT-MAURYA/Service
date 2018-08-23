package com.citizencenter.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MyService extends Service
{
    public int i=0;

    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this, "Service Created", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onStart(Intent intent, int startid)
    {
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        /*Handler handler = new Handler();
        for (i = 0; i<10;i++) {
            handler.postDelayed(new Runnable() {
                @Override
                public void run()
                {
                    Toast.makeText(MyService.this, ""+i, Toast.LENGTH_LONG).show();
                }
            }, 1000);
        }*/
    }
    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service Stopped", Toast.LENGTH_LONG).show();
    }
}
