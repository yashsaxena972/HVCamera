package com.example.hvcamera;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.app.ActionBar;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class ReviewActivity extends AppCompatActivity {

    private ImageView reviewImageView;
    private Button closeButton;
    private String image_path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        reviewImageView = findViewById(R.id.review_image_view);
        closeButton = findViewById(R.id.close_button);

        image_path = getIntent().getStringExtra("imagePath");
        Bitmap bitmap = BitmapFactory.decodeFile(image_path);
        reviewImageView.setImageBitmap(bitmap);

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}