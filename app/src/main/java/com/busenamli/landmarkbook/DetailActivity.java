package com.busenamli.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

//import static com.busenamli.landmarkbook.MainActivity.selectedImage;

public class DetailActivity extends AppCompatActivity {

    ImageView landmarkImageView;
    TextView landmarkNameTextView;
    TextView countryNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        landmarkImageView = findViewById(R.id.landmarkImageView);
        landmarkNameTextView = findViewById(R.id.landmarkNameTextView);
        countryNameTextView = findViewById(R.id.countryNameTextView);

        Intent intent = getIntent();
        String name = intent.getStringExtra("landmarkName");
        landmarkNameTextView.setText(name);

        String cName = intent.getStringExtra("countryName");
        countryNameTextView.setText(cName);

        //landmarkImageView.setImageBitmap(selectedImage);
        Singleton singleton = Singleton.getInstance();
        landmarkImageView.setImageBitmap(singleton.getChosenImage());


    }
}