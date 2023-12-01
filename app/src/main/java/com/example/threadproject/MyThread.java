package com.example.threadproject;

import android.os.Handler;
import android.widget.TextView;

public class MyThread extends Thread {
    int count = 0;

    TextView textview;
    Handler handler;

    MyThread(TextView textView){
        this.textview = textView;
        handler = new Handler();
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            count++;
            handler.post(new Runnable() {
                @Override
                public void run() {
                    textview.setText(String.valueOf(count));
                }
            });
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
