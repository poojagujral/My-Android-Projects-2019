package com.example.poojagujral.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button but;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        but= (Button) findViewById(R.id.btn3);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j= new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(j);
            }
        });
    }
}
