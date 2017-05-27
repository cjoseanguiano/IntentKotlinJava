package com.devix.www.usodeintentinkotlin.Java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.devix.www.usodeintentinkotlin.R;

public class SecondJava extends AppCompatActivity {

    private static final String EXTRA_NAMEX = "sendUser";
    private static final int CODIGO = 1;
    private static final String TAG = SecondJava.class.getSimpleName();
    private Button JsecondJava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_java);

        final String value = "SecondJava";
        JsecondJava = (Button) findViewById(R.id.JsecondJava);

        String valueOfTakeDataJava = getIntent().getStringExtra("id");
        Log.i(TAG, "onCreate: " + valueOfTakeDataJava);

        JsecondJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(EXTRA_NAMEX, value);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }

}
