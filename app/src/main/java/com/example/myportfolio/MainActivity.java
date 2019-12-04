package com.example.myportfolio;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ImageButton open = findViewById(R.id.open);
       ImageButton close = findViewById(R.id.close);
        open.setOnClickListener((v)->{
            drawer = (DrawerLayout) findViewById(R.id.drawer);
            if (!drawer.isDrawerOpen(Gravity.LEFT)) {
                drawer.openDrawer(Gravity.LEFT) ;
            }
        });

/*        close.setOnClickListener((v)->{
            drawer = (DrawerLayout) findViewById(R.id.drawer);
            if (drawer.isDrawerOpen(Gravity.LEFT)) {
                drawer.closeDrawer(Gravity.LEFT) ;
            }
        });*/


 /*      close.setOnClickListener(new ImageButton.OnClickListener(){
           @Override
           public void onClick(View v) {
               DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer) ;
               if (!drawer.isDrawerOpen(Gravity.LEFT)) {
                   drawer.openDrawer(Gravity.LEFT) ;
               }
           }
       });
        open.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer) ;
                if (drawer.isDrawerOpen(Gravity.LEFT)) {
                    drawer.closeDrawer(Gravity.LEFT) ;
                }
            }

        });*/
    }
}
