package jp.techacademy.takuya.okitsu.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        EditText value1 = (EditText) findViewById(R.id.text1);
        EditText value2 = (EditText) findViewById(R.id.text2);

        try{

            double value01 = Double.valueOf(value1.getText().toString());
            double value02 = Double.valueOf(value2.getText().toString());
            switch(v.getId()){
                case R.id.button1:
                    double value03 = value01 + value02;
                    intent.putExtra("VALUE3",value03);
                    break;
                case R.id.button2:
                    double value04 = value01 - value02;
                    intent.putExtra("VALUE3",value04);
                    break;
                case R.id.button3:
                    double value05 = value01 * value02;
                    intent.putExtra("VALUE3",value05);
                    break;
                default:
                    double value06 = value01 / value02;
                    intent.putExtra("VALUE3",value06);

            }
            startActivity(intent);
        }catch (Exception ex)
        {
            //textView.setText("数値が間違っています。");
            Toast.makeText(this, "数字が未入力です", Toast.LENGTH_SHORT).show();

            ex.printStackTrace();
        }





    }
}
