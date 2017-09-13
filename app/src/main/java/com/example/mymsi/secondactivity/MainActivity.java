package com.example.mymsi.secondactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = (Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
              //  Intent intent = new Intent(MainActivity.this,AnotherActivity.class);//显示启动
                Intent intent = new Intent();
                intent.setAction("anotherActivity");
                startActivity(intent);
            }
        });
    }
}
