package com.example.jumate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class merchandisesection2 extends AppCompatActivity {
    TextView title, price;
    ImageView imageView;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchandisesection2);
        title = findViewById(R.id.itemTitle);
        price = findViewById(R.id.itemPrice);
        imageView = findViewById(R.id.itemImage);

        Intent intent = getIntent();
        String item = intent.getStringExtra("item1");

        if (item != null) {
            switch (item) {
                case "0":
                    imageView.setImageResource(R.drawable.tshirt1);
                    title.setText("T-shirt");
                    price.setText("Rs 61,000");
                    // Set image and rating as needed
                    break;
                case "1":
                    imageView.setImageResource(R.drawable.tshirt2);
                    title.setText("Hoodie Black");
                    price.setText("Rs 45,000");
                    // Set image and rating as needed
                    break;
                case "2":
                    imageView.setImageResource(R.drawable.tshirt3);
                    title.setText("JU T-shirt");
                    price.setText("Rs 82,000");
                    // Set image and rating as needed
                    break;
                case "3":
                    imageView.setImageResource(R.drawable.tshirt6);
                    title.setText("Hoodie RED");
                    price.setText("Rs 82,000");
                    // Set image and rating as needed
                    break;
                case "4":
                    imageView.setImageResource(R.drawable.tshirt5);
                    title.setText("Hoodie");
                    price.setText("Rs 82,000");
                    // Set image and rating as needed
                    break;
                case "5":
                    imageView.setImageResource(R.drawable.tshirtmerch);
                    title.setText("Black design T-shirt");
                    price.setText("Rs 82,000");
                    // Set image and rating as needed
                    break;
                case "6":
                    imageView.setImageResource(R.drawable.hoodie);
                    title.setText("Plain White Hoodie");
                    price.setText("Rs 82,000");
                    // Set image and rating as needed
                    break;
                case "7":
                    imageView.setImageResource(R.drawable.tshirt4);
                    title.setText("Navy Blue Hoodie");
                    price.setText("Rs 82,000");
                    // Set image and rating as needed
                    break;

                case "8":
                    imageView.setImageResource(R.drawable.shoes);
                    title.setText("Shoes");
                    price.setText("Rs 82,000");
                    // Set image and rating as needed
                    break;
                case "9":
                    imageView.setImageResource(R.drawable.cap);
                    title.setText("Cap");
                    price.setText("Rs 82,000");
                    // Set image and rating as needed
                    break;
                default:
                    Toast.makeText(this, "Invalid item selected", Toast.LENGTH_SHORT).show();
                    finish();
                    break;
            }
        } else {
            Toast.makeText(this, "Item value is null", Toast.LENGTH_SHORT).show();
            finish();
        }

        Button addToCartButton = findViewById(R.id.addToCartButton);
        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(merchandisesection2.this, "Item added to cart successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }

}

