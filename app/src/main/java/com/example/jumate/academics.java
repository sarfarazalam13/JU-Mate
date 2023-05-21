package com.example.jumate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class  academics extends AppCompatActivity implements View.OnClickListener {
    Button button;
    Button ERP;
    Button PP;
    Button Ebook;
    Button notice;
    Button Contact;
    Button fee;
    Button QR;
   Button calendar;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);
        button=(Button) findViewById(R.id.Courses);
        ERP=(Button) findViewById(R.id.erp);
        PP=(Button) findViewById(R.id.Parents);
        Ebook=(Button) findViewById(R.id.ebook);
        notice=(Button)findViewById(R.id.notice);
        Contact=(Button)findViewById(R.id.contacts);
        fee=(Button)findViewById(R.id.fee);
        calendar=(Button)findViewById(R.id.acadamiccalander);
        toolbar=findViewById(R.id.academicstoolbar);
        setSupportActionBar(toolbar);
        QR=findViewById(R.id.qr);

        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle("Academics");

        }


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        QR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openqr();
            }
        });





        fee.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                gotoUrl("https://securepayments.payu.in/omni/JECRCU/");
            }
        });

        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfaculty();
            }
        });




        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotice();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCourses();
            }
        });
        Ebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEbooks();
            }
        });
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencalendar();
            }
        });

        ERP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://jecrc.mastersofterp.in/iitmsv4eGq0RuNHb0G5WbhLmTKLmTO7YBcJ4RHuXxCNPvuIw=?enc=iF6gEp4ArHiXP7jJ9QlgUyiC5t8GbTA5A/9xbk1Vtqk=");
            }
        });
        PP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://sws.jecrcuniversity.edu.in/parentlogin/\n");
            }
        });

    }

    private void openqr() {
        Intent intent=new Intent(this,QR.class);
        startActivity(intent);
    }

    private void openfaculty() {
        Intent intent=new Intent(this,faculty.class);
        startActivity(intent);
    }

    private void opennotice() {
        Intent intent=new Intent(this,notice.class);
        startActivity(intent);

    }

    private void openEbooks() {
        Intent intent=new Intent(this,Ebooks.class);
        startActivity(intent);
    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
    private void opencalendar() {
        Intent intent=new Intent(this,calendarsection.class);
        startActivity(intent);
    }

    public void openCourses()
    {
        Intent intent=new Intent(this,courses.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {

    }
}