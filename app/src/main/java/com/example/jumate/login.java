package com.example.jumate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText email,password;
    Button log,register,guest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        log=findViewById(R.id.Login);
        email=findViewById(R.id.idEdtUserName);
        password=findViewById(R.id.idEdtPassword);
        register=findViewById(R.id.Register);
        guest=findViewById(R.id.nosighin);

        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmain();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openregister();
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eemail,ppassword;
                eemail=email.getText().toString();
                ppassword=password.getText().toString();

                if(TextUtils.isEmpty(eemail))
                {
                    Toast.makeText(login.this, "Enter Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(ppassword))
                {
                    Toast.makeText(login.this, "Enter Password", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }

    private void openmain() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    private void openregister() {
        Intent intent=new Intent(this,register.class);
        startActivity(intent);

    }


}
