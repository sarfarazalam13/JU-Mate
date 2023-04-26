package com.example.jumate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridLayout gl1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gl1=(GridLayout) findViewById(R.id.gl1);
        setSingleEvent(gl1);
    }

    private void setSingleEvent(GridLayout gl1) {
        for(int i=0;i<gl1.getChildCount();i++)
        {
            CardView cardview =(CardView) gl1.getChildAt(i);
            final int final1=i;
            cardview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(final1==0)
                    {
                        Intent intent=new Intent(MainActivity.this,academics.class);
                        startActivity(intent);
                    }
                   else if(final1==1)
                    {
                       Intent intent=new Intent(MainActivity.this,Cafetaria.class);
                        startActivity(intent);
                    }
                    else if(final1==2)
                    {
                        Intent intent=new Intent(MainActivity.this,merchandisesection.class);
                        startActivity(intent);
                    }
                    else if(final1==3)
                    {
                        Intent intent=new Intent(MainActivity.this,stationarysection.class);
                        startActivity(intent);
                    }
                    else if(final1==4)
                    {
                        Intent intent=new Intent(MainActivity.this,dispensarysection.class);
                        startActivity(intent);
                    }
                    else if(final1==5)
                    {
                        Intent intent=new Intent(MainActivity.this,studentsection.class);
                        startActivity(intent);
                    }

                    else
                    {
                        Toast.makeText(MainActivity.this,"NO Items",Toast.LENGTH_SHORT).show();
                    }
                }


            });
        }
    }
}