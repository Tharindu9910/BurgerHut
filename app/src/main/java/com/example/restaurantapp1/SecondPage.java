package com.example.restaurantapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondPage extends AppCompatActivity {


    ImageButton imageButtonHam;
    ImageButton imageButtonCheese;
    ImageButton imageButtonVeggie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);


        imageButtonHam = (ImageButton) findViewById(R.id.imageButton);
        imageButtonCheese = (ImageButton) findViewById(R.id.imageButton2);
        imageButtonVeggie = (ImageButton) findViewById(R.id.imageButton3);


        Intent intent = new Intent(this, ThirdPage.class);


        imageButtonHam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Name","HamBurger");
                intent.putExtra("Price","100");
                String imageResourceString = String.valueOf(R.drawable.ham);
                intent.putExtra("IMAGE_RESOURCE_STRING", imageResourceString);
                startActivity(intent);
            }
        });
        imageButtonCheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Name","Cheese Burger");
                intent.putExtra("Price","120");
                String imageResourceString = String.valueOf(R.drawable.cheese);
                intent.putExtra("IMAGE_RESOURCE_STRING", imageResourceString);
                startActivity(intent);
            }
        });
        imageButtonVeggie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Name","Vegi Burger");
                intent.putExtra("Price","80");
                String imageResourceString = String.valueOf(R.drawable.vegi);
                intent.putExtra("IMAGE_RESOURCE_STRING", imageResourceString);
                startActivity(intent);
            }
        });


    }

}