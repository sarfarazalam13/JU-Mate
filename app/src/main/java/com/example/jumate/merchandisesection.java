package com.example.jumate;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class merchandisesection extends AppCompatActivity {
    private Button buy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchandisesection);


       buy = findViewById(R.id.buyButton1);
      buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to open the new activity
                Intent intent = new Intent(merchandisesection.this,merchandisesection2.class);
                startActivity(intent);
            }
        });
    }
}
