package jp.techacademy.takuya.okitsu.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();


        //String value1 = intent.getStringExtra("VALUE1");
        //String value2 = intent.getStringExtra("VALUE2");
        double value3 = intent.getDoubleExtra("VALUE3",0.0);

       // int value01 = Integer.parseInt(value1);
       // int value02 = Integer.parseInt(value2);

        //double value03 = Double.valueOf(value3);

        TextView textView = (TextView) findViewById(R.id.textView);


        textView.setText(String.valueOf(value3));


    }
}
