package com.example.poojagujral.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button but1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        but1= (Button) findViewById(R.id.but3);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////add this line to permit implicit intent in manifest file
                Intent k= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+91)123456789"));
                startActivity(k);

            }
        });

    }
}
