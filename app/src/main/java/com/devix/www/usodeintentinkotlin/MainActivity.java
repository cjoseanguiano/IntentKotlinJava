package com.devix.www.usodeintentinkotlin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.devix.www.usodeintentinkotlin.Java.TakeDataJava;
import com.devix.www.usodeintentinkotlin.Kotlin.TakeDataKotlin;

public class MainActivity extends AppCompatActivity {

    private Button btnJava;
    private Button btnKotlin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJava = (Button) findViewById(R.id.btnJava);
        btnKotlin = (Button) findViewById(R.id.btnKotlin);

        btnJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TakeDataJava.class);
                startActivity(intent);
            }
        });

        btnKotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TakeDataKotlin.class);
                startActivity(intent);
            }
        });
    }
}
