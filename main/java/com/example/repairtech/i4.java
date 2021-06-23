package com.example.repairtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class i4 extends AppCompatActivity {
    Button exiti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i4);
        exiti=(Button)findViewById(R.id.bexiti);
        exiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "EXIT", Toast.LENGTH_SHORT).show();
                Intent intent11 = new Intent(i4.this,r2.class);
                startActivity(intent11);
            }
        });
    }
}