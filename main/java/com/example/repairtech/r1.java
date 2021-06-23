package com.example.repairtech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.content.Intent;
import android.widget.ImageButton;

public class r1 extends AppCompatActivity {
    Button a,c,d,e,f;
    Intent intent1,intent6,intent3,intent4,intent5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r1);
        a=(Button)findViewById(R.id.b1);
        c=(Button)findViewById(R.id.b2);
        d=(Button)findViewById(R.id.b3);
        e=(Button)findViewById(R.id.b4);
        f=(Button)findViewById(R.id.b5);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent1 = new Intent(getApplicationContext(), i1.class);
                startActivity(intent1);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent6 = new Intent(getApplicationContext(), i2.class);
                startActivity(intent6);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent3 = new Intent(getApplicationContext(), i3.class);
                startActivity(intent3);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent4 = new Intent(getApplicationContext(), i4.class);
                startActivity(intent4);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent5 = new Intent(getApplicationContext(), i5.class);
                startActivity(intent5);
            }
        });
    }
}