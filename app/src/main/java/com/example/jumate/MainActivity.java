package com.example.jumate;


import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth mAuth;
    GridLayout gl1;

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();

        // Setup the toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Find views
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        gl1 = findViewById(R.id.gl1);
        setSingleEvent(gl1);


        // Setup ActionBarDrawerToggle
        drawerToggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.Open_drawer,
                R.string.Close_drawer
        );
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        // Setup navigation item selected listener
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.dev) {
                    Intent intent = new Intent(MainActivity.this, devs.class);
                    startActivity(intent);
                } else {
                    mAuth.signOut();
                    Intent intent = new Intent(MainActivity.this, login.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Logged Out", Toast.LENGTH_SHORT).show();
                }

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle ActionBarDrawerToggle events
        if (drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
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
                    else if(final1==6)
                    {
                        Intent intent=new Intent(MainActivity.this,MapsActivity.class);
                        startActivity(intent);
                    }
                    else if(final1==7)
                    {
                        mAuth.signOut();
                        Intent intent=new Intent(MainActivity.this,login.class);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this,"Logged Out",Toast.LENGTH_SHORT).show();
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





/*

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    GridLayout gl1;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        gl1 = findViewById(R.id.gl1);
        setSingleEvent(gl1);
        toolbar = findViewById(R.id.maintoolbar);
        toolbar.setTitleTextColor(Color.BLACK);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navi);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.Open_drawer, R.string.Close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.dev) {
                    Toast.makeText(MainActivity.this, "DEVS", Toast.LENGTH_SHORT).show();
                } else {
                    mAuth.signOut();
                    Intent intent = new Intent(MainActivity.this, login.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Logged Out", Toast.LENGTH_SHORT).show();
                }

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
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
                    else if(final1==6)
                    {
                        Intent intent=new Intent(MainActivity.this,MapsActivity.class);
                        startActivity(intent);
                    }
                    else if(final1==7)
                    {
                        mAuth.signOut();
                        Intent intent=new Intent(MainActivity.this,login.class);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this,"Logged Out",Toast.LENGTH_SHORT).show();
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

 */
