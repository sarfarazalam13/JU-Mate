package com.example.jumate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class studentsection extends AppCompatActivity {
    GridLayout gl2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentsection);
        gl2=(GridLayout) findViewById(R.id.gl1);
        setSingle(gl2);
    }

    private void setSingle(GridLayout gl1) {
        for(int i=0;i<gl1.getChildCount();i++)
        {
            CardView cardview =(CardView) gl1.getChildAt(i);
            final int final1=i;
            cardview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(final1==0)
                    {
                        gotoUrl("https://jecrcuniversity.edu.in/student-council-voice-of-students/\n");
                    }
                    else if(final1==1)
                    {
                        gotoUrl("https://jecrcincubation.com/\n");
                    }
                    else if(final1==2)
                    {
                        gotoUrl("https://jecrcuniversity.edu.in/ju-socialz-social-media-marketing-cell/\n");
                    }
                    else if(final1==3)
                    {
                        gotoUrl("https://www.instagram.com/accounts/login/?next=https%3A%2F%2Fwww.instagram.com%2Fmaverick__club%2Fp%2FBf6KRU4hNYX%2F%3Fhl%3Den%26__coig_restricted%3D1%26__coig_login%3D1/\n");
                    }
                    else if(final1==4)
                    {
                        gotoUrl("https://www.iaestejecrc.com/\n");
                    }
                    else if(final1==5)
                    {
                        gotoUrl("https://ju-makerspace.github.io/about.html\n");
                    }

                    else
                    {
                        Toast.makeText(studentsection.this,"NO Items",Toast.LENGTH_SHORT).show();
                    }
                }


            });
        }
    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}