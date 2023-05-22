package com.example.jumate;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class devs extends AppCompatActivity {
    Toolbar toolbar;

    private ImageView developer1SocialMedia;
    private ImageView developer2SocialMedia;
    // Add more ImageView variables for other developers as needed

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devs);
        toolbar=findViewById(R.id.devtoolbar);
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle("Devs");

        }


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        developer1SocialMedia = findViewById(R.id.developer1SocialMedia);
        developer2SocialMedia = findViewById(R.id.developer2SocialMedia);

        developer1SocialMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSocialMediaProfile("https://www.example.com/developer1");
            }
        });

        developer2SocialMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSocialMediaProfile("https://www.example.com/developer2");
            }
        });

        // Add more onClickListeners for other developers as needed
    }

    private void openSocialMediaProfile(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
