package com.example.repairtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class i5 extends AppCompatActivity {
    Button exitn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i5);
        exitn=(Button)findViewById(R.id.bexitp);
        exitn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "EXIT", Toast.LENGTH_SHORT).show();
                Intent intent11 = new Intent(i5.this,r2.class);
                startActivity(intent11);
            }
        });
    }
}