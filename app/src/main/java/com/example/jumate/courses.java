package com.example.jumate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class courses extends AppCompatActivity {
    Button dsa;Button sepm;Button aiml;Button java;Button c; Button os; Button cn;Button python;Button dbms;Button cg;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        dsa=(Button)findViewById(R.id.dsa);
        dsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.freepdfbook.com/data-structures-with-c-schaums-outline-series/");
            }
        });

        sepm=(Button)findViewById(R.id.sepm);
        sepm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.scribd.com/document/415414060/Software-Engineering-and-Project-Managements-SEPM-CSE-IT-Third-Year-Notes-Books-eBook-PDF-Download");
            }
        });

        aiml=(Button)findViewById(R.id.aiml);
        aiml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.scribd.com/document/415414060/Software-Engineering-and-Project-Managements-SEPM-CSE-IT-Third-Year-Notes-Books-eBook-PDF-Download");
            }
        });

        java=(Button)findViewById(R.id.java);
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.scribd.com/document/415414060/Software-Engineering-and-Project-Managements-SEPM-CSE-IT-Third-Year-Notes-Books-eBook-PDF-Download");
            }
        });

        os=(Button)findViewById(R.id.os);
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.scribd.com/document/415414060/Software-Engineering-and-Project-Managements-SEPM-CSE-IT-Third-Year-Notes-Books-eBook-PDF-Download");
            }
        });
        cn=(Button)findViewById(R.id.ch);
        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.scribd.com/document/415414060/Software-Engineering-and-Project-Managements-SEPM-CSE-IT-Third-Year-Notes-Books-eBook-PDF-Download");
            }
        });
        python=(Button)findViewById(R.id.python);
        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.scribd.com/document/415414060/Software-Engineering-and-Project-Managements-SEPM-CSE-IT-Third-Year-Notes-Books-eBook-PDF-Download");
            }
        });
        c=(Button)findViewById(R.id.c);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.scribd.com/document/415414060/Software-Engineering-and-Project-Managements-SEPM-CSE-IT-Third-Year-Notes-Books-eBook-PDF-Download");
            }
        });
        dbms=(Button)findViewById(R.id.dbms);
        dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.scribd.com/document/415414060/Software-Engineering-and-Project-Managements-SEPM-CSE-IT-Third-Year-Notes-Books-eBook-PDF-Download");
            }
        });
        cg=(Button)findViewById(R.id.cg);
        cg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.scribd.com/document/415414060/Software-Engineering-and-Project-Managements-SEPM-CSE-IT-Third-Year-Notes-Books-eBook-PDF-Download");
            }
        });
    }


    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}