package com.example.activityuitest;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=(Button)findViewById(R.id.button01);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ActivitySignIn.class);
                startActivity(intent);
            }
        });
        Button button4=(Button)findViewById(R.id.button04);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ActivitySignUp.class);
                startActivity(intent);
            }
        });
        Button button2=(Button)findViewById(R.id.button02);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "新浪微博登陆", Toast.LENGTH_SHORT).show();
            }
        });
        Button button3=(Button)findViewById(R.id.button03);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "腾讯微博登陆", Toast.LENGTH_SHORT).show();
            }
        });




    }
}
