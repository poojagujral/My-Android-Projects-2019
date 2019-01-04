package com.example.poojagujral.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tv1;
    EditText ed1, ed2, ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= (Button) findViewById(R.id.click);
        tv1= (TextView) findViewById(R.id.myTextView);
        ed1= (EditText) findViewById((R.id.ed1));
        ed2= (EditText) findViewById((R.id.ed2));
        ed3= (EditText) findViewById((R.id.ed3));


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //at start, abstract function (has name, parameter, no body)

                //Toast is a class used to display text for short duration; similar to printf n takes 3 parameters
                //mainActivity ka reference
                //Length is constant
                //show() is to display
                //code below
                //Toast.makeText(MainActivity.this,"Happy New Year", Toast.LENGTH_LONG ).show();

                //tv1.setText("Happy New Year");

                //String s= ed1.getText().toString(); //to enter the number from user

                //to connect one activity to another we use intent; 2 types: implicit and explicit(read)

                Intent i= new Intent(MainActivity.this, Main2Activity.class);//intent takes 2 param; source n dest
                startActivity(i);


            }
        });
    }
}
