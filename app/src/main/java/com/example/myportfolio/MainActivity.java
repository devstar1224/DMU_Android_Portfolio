package com.example.myportfolio;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ImageView open = findViewById(R.id.open);
        open.setOnClickListener((v)->{
            drawer = (DrawerLayout) findViewById(R.id.drawer);
            if (!drawer.isDrawerOpen(Gravity.LEFT)) {
                drawer.openDrawer(Gravity.LEFT) ;
            }
        });

        Button Home, Project, Contect;
        Home = findViewById(R.id.home);
        Project = findViewById(R.id.project);
        Contect = findViewById(R.id.contect);


        Project.setOnClickListener((v)->{
//            Project.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.rollMenuBackgroundEnable));
//            Project.setTextColor(getApplicationContext().getResources().getColor(R.color.rollMenuTextEnable));
//            Home.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.rollMenuBackgroundDisable));
//            Home.setTextColor(getApplicationContext().getResources().getColor(R.color.rollMenuTextDisable));
//            Contect.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.rollMenuBackgroundDisable));
//            Contect.setTextColor(getApplicationContext().getResources().getColor(R.color.rollMenuTextDisable));
            Intent it = new Intent(MainActivity.this, ProjectActivity.class);
            startActivity(it);
        });
//
    Contect.setOnClickListener((v)->{
//            Contect.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.rollMenuBackgroundEnable));
//            Contect.setTextColor(getApplicationContext().getResources().getColor(R.color.rollMenuTextEnable));
//            Project.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.rollMenuBackgroundDisable));
//            Project.setTextColor(getApplicationContext().getResources().getColor(R.color.rollMenuTextDisable));
//            Home.setBackgroundColor(getResources().getColor(R.color.rollMenuBackgroundDisable));
//            Home.setTextColor(getResources().getColor(R.color.rollMenuTextDisable));
//
        Intent it = new Intent(MainActivity.this, ContactActivity.class);
        startActivity(it);
      });
    }
}
