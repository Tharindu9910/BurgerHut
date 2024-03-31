package com.example.restaurantapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class FirstPage extends AppCompatActivity {


    private ListView category;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);


        String[] categoryArray={"Food Items","Drinks","Stores"};

        category=(ListView) findViewById(R.id.listitems);

        ArrayAdapter adapter=new ArrayAdapter(this, R.layout.raw,categoryArray);
        category.setAdapter(adapter);
        //category.setTextColor(Color.black);

        category.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Intent intent=new Intent(getApplicationContext(),SecondPage.class);
                    adapterView.getItemAtPosition(i);
                    // Set the item as checked to be highlighted
                    category.setSelector(R.color.design_default_color_background);

                    startActivity(intent);
                }


            }
        });


    }
}