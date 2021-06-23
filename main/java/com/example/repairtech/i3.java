package com.example.repairtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class i3 extends AppCompatActivity {
    Button exity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i3);
        exity=(Button)findViewById(R.id.bexity);
        exity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "EXIT", Toast.LENGTH_SHORT).show();
                Intent intent11 = new Intent(i3.this,r2.class);
                startActivity(intent11);
            }
        });
    }
}