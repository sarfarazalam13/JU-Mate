package com.example.jumate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ExampleItem {
    private int mImageResource;
    private String mText1;
    private String email;

    public ExampleItem(int imageResource, String text1,String email) {
        mImageResource = imageResource;
        mText1 = text1;
        this.email=email;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public String getText1() {
        return mText1;
    }
    public String getEmail(){return email;}

}