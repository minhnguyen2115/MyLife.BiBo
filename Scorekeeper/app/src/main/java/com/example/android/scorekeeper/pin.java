package com.example.android.scorekeeper;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class pin extends AppCompatActivity {
    ImageView imgV;
    Button bt1, bt2;
    int i = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);

        imgV = (ImageView) findViewById(R.id.imageView);
        bt1 = (Button) findViewById(R.id.plus);
        bt2 = (Button) findViewById(R.id.minus);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==4){
                    imgV.setImageLevel(i);
                    i++;
                }
                else
                    Toast.makeText(pin.this, "Max level", Toast.LENGTH_SHORT).show();
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==4){
                    Toast.makeText(pin.this, "Max level", Toast.LENGTH_SHORT).show();
                }
                else {
                    i++;
                    imgV.setImageLevel(i);
                }

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==1){
                    Toast.makeText(pin.this, "Max level", Toast.LENGTH_SHORT).show();
                }
                else{
                    i--;
                    imgV.setImageLevel(i);
                }
            }
        });
    }
}
