package com.example.restaurantapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdPage extends AppCompatActivity {

    TextView textViewList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);


        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                // Extract the data from the extras bundle
                String name = extras.getString("Name");
                String price = extras.getString("Price");

                TextView txtName = findViewById(R.id.txtName);
                TextView txtPrice = findViewById(R.id.txtPrice);

                txtName.setText("Name: " + name);
                txtPrice.setText("Price: Rs. " + price + ".00");

                ImageView imageView = findViewById(R.id.txtimage);

                // Get the image resource string from the Intent extras
                String imageResourceString = getIntent().getStringExtra("IMAGE_RESOURCE_STRING");

                // Convert the string back to an integer (image resource ID)
                int imageResourceId = Integer.parseInt(imageResourceString);

                // Load the image into the ImageView
                imageView.setImageResource(imageResourceId);

            }
        }
    }
}