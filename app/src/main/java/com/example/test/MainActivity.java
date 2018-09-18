package com.example.test;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


 private ImageView iamgeview;

    private TextView textView;

    //增加一行注释
      //增加了第三行注释 

      Handler mhander = new Handler(){

        @Override
        public void handleMessage(Message msg) {
            if(msg.what == 1){
                Toast.makeText(MainActivity.this,"toast",Toast.LENGTH_SHORT).show();
            }
            super.handleMessage(msg);
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Message message  = mhander.obtainMessage(1);
        mhander.sendMessageDelayed(message,10000);
        textView = findViewById(R.id.textview);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(   mhander.hasMessages(1))
                {
                    Log.d("TAG","remove handelr");
                    mhander.removeMessages(1);
                }

            }
        });

    }
}
