package com.example.repairtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
public class i1 extends AppCompatActivity {
    Button bU;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i1);
        bU=(Button)findViewById(R.id.bexit);
        bU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "EXIT", Toast.LENGTH_SHORT).show();
                Intent intent10 = new Intent(i1.this,r2.class);
                startActivity(intent10);
            }
        });
    }
}