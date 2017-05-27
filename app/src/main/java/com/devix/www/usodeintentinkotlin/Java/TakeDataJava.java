package com.devix.www.usodeintentinkotlin.Java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.devix.www.usodeintentinkotlin.R;

public class TakeDataJava extends AppCompatActivity {

    private static final int CODIGO = 1;
    private static final String TAG = TakeDataJava.class.getSimpleName();
    private static final String EXTRA_NAMEX = "sendUser";
    private Button sendIntent;
    private String valueFinal = "TakeDataJava";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_java);

        sendIntent = (Button) findViewById(R.id.JsendIntent);
        sendIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TakeDataJava.this, SecondJava.class);
                intent.putExtra("id", valueFinal);
                startActivityForResult(intent, CODIGO);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CODIGO && resultCode == RESULT_OK) {
            String userName = data.getStringExtra(EXTRA_NAMEX);
            Log.i(TAG, "onActivityResult: " + userName);
            Toast.makeText(this, userName, Toast.LENGTH_SHORT).show();
        }
    }
}
