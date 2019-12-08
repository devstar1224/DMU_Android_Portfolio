package com.example.myportfolio;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProjectPopupHandler extends AppCompatActivity {
    ImageView imageview;
    TextView title;
    TextView desc;
    TextView location;
    TextView date;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project_popup);

        imageview = (ImageView)findViewById(R.id.img1);
        title = (TextView)findViewById(R.id.title);
        desc = (TextView)findViewById(R.id.desc);
        location = (TextView)findViewById(R.id.location);
        date = (TextView)findViewById(R.id.date);

        Intent it = getIntent();

        int imageNumber = it.getIntExtra("image",0);
        if(imageNumber==0){
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.main_icon));
        }else if(imageNumber==1){
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.optimize));
        } else if (imageNumber == 2) {
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.music));
        }else if(imageNumber == 3) {
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.facereg));
        }
        title.setText(it.getStringExtra("title"));
        desc.setText(it.getStringExtra("desc"));
        location.setText(it.getStringExtra("location"));
        date.setText(it.getStringExtra("date"));
    }
    }
