package com.ander.countries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    ImageView imv;
    TextView tv;

    String countName="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imv = findViewById(R.id.indmap);
        tv = findViewById(R.id.indh);

        Bundle bundle = getIntent().getExtras();

        countName = bundle.getString("name");

        if(countName.equals("india")){
            imv.setImageResource(R.drawable.indmap);
            tv.setText(R.string.ind);
        }

        if(countName.equals("japan")){
            imv.setImageResource(R.drawable.japanmap);
            tv.setText(R.string.jpn);
        }

        if(countName.equals("sk")){
            imv.setImageResource(R.drawable.skmap);
            tv.setText(R.string.skh);
        }



    }
}