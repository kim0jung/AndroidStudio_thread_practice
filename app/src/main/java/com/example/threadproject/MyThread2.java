package com.example.threadproject;

import android.app.Activity;
import android.widget.TextView;

public class MyThread2 implements Runnable{

    int count = 0;

    TextView textview;
    Activity activity;

    MyThread2(Activity activity, TextView textView){
        this.activity = activity;
        this.textview = textView;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            count++;
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    textview.setText(String.valueOf(count));
                }
            });

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
