package com.example.threadproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v){
        TextView textView1 = findViewById(R.id.textView);
        MyThread myThread = new MyThread(textView1);
        myThread.start();


        TextView textView2 = findViewById(R.id.textView2);
        MyThread2 myThread2 = new MyThread2(this, textView2);
        Thread thread = new Thread(myThread2);
        thread.start();

    }
}

