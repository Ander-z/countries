package com.ander.countries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button india, japan, skbu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        india = (Button) findViewById(R.id.ind);
        japan = (Button) findViewById(R.id.japanB);
        skbu = (Button) findViewById(R.id.skbutton);



        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(MainActivity.this, MainActivity2.class);
                int1.putExtra("name", "india");
                startActivity(int1);

            }
        });

        japan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(MainActivity.this, MainActivity2.class);
                int1.putExtra("name", "japan");
                startActivity(int1);

            }
        });

        skbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(MainActivity.this, MainActivity2.class);
                int1.putExtra("name", "sk");
                startActivity(int1);

            }
        });




    }
}