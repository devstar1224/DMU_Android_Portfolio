package com.example.myportfolio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity  extends AppCompatActivity  {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_main);
        ImageButton git = findViewById(R.id.git);
        ImageButton mail = findViewById(R.id.mail);

        git.setOnClickListener((v) -> {
            Toast.makeText( this, "깃허브로 이동합니다.", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/devstar1224"));
            this.startActivity(intent);
        });

        mail.setOnClickListener((v) -> {
            Toast.makeText( this, "메일을 작성합니다.", Toast.LENGTH_SHORT).show();
            Intent email = new Intent(Intent.ACTION_SEND);
            email.setType("plain/Text");
            email.putExtra(Intent.EXTRA_EMAIL, getString(R.string.email));
            email.setType("message/rfc822");
            startActivity(email);
        });
    }
}
