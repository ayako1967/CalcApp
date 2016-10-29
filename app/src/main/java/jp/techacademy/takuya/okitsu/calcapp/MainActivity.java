package jp.techacademy.takuya.okitsu.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


     private EditText text1 ;
     private EditText text2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         text1 = (EditText) findViewById(R.id.text1);
         text2 = (EditText) findViewById(R.id.text2);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(this,SecondActivity.class);

        intent.putExtra("VALUE1",text1.getText().toString());
        intent.putExtra("VALUE2",text2.getText().toString());
        startActivity(intent);
    }
}
