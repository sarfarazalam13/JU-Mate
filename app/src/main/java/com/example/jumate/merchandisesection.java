package com.example.jumate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class merchandisesection extends AppCompatActivity {
    GridLayout gl1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchandisesection);
        gl1 = findViewById(R.id.gl2);
        setSingleEvent(gl1);
    }

    private void setSingleEvent(GridLayout gl1) {
        for (int i = 0; i < gl1.getChildCount(); i++) {
            CardView cardView = (CardView) gl1.getChildAt(i);
            final int final1 = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (final1 == 0) {
                        String x = "0";
                        Intent intent = new Intent(getApplicationContext(), merchandisesection2.class);
                        intent.putExtra("item1", x);
                        startActivity(intent);
                    } else if (final1 == 1) {
                        String x = "1";
                        Intent intent = new Intent(getApplicationContext(), merchandisesection2.class);
                        intent.putExtra("item1", x);
                        startActivity(intent);
                    } else if (final1 == 2) {
                        String x = "2";
                        Intent intent = new Intent(getApplicationContext(), merchandisesection2.class);
                        intent.putExtra("item1", x);
                        startActivity(intent);
                    } else if (final1 == 3) {
                        String x = "3";
                        Intent intent = new Intent(getApplicationContext(), merchandisesection2.class);
                        intent.putExtra("item1", x);
                        startActivity(intent);
                    } else if (final1 == 4) {
                        String x = "4";
                        Intent intent = new Intent(getApplicationContext(), merchandisesection2.class);
                        intent.putExtra("item1", x);
                        startActivity(intent);
                    } else if (final1 == 5) {
                        String x = "5";
                        Intent intent = new Intent(getApplicationContext(), merchandisesection2.class);
                        intent.putExtra("item1", x);
                        startActivity(intent);
                    } else if (final1 == 6) {
                        String x = "6";
                        Intent intent = new Intent(getApplicationContext(), merchandisesection2.class);
                        intent.putExtra("item1", x);
                        startActivity(intent);
                    } else if (final1 == 7) {
                        String x = "7";
                        Intent intent = new Intent(getApplicationContext(), merchandisesection2.class);
                        intent.putExtra("item1", x);
                        startActivity(intent);
                    } else {
                        Toast.makeText(merchandisesection.this, "NO Items", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}


