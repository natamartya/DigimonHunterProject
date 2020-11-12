package com.example.uxproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class homesilver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homesilver);

        ImageButton logoutButton = (ImageButton)findViewById(R.id.logoutBtn);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homesilver.this, MainActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(homesilver.this, "Successfully Logout", Toast.LENGTH_SHORT).show();
            }
        });

//        ImageButton digimonButton = (ImageButton)findViewById(R.id.digimonBtn);
//        digimonButtonButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(homesilver.this, digimonPage.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageButton contactusButton = (ImageButton)findViewById(R.id.contactusBtn);
//        contactusButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(homesilver.this, contactusPage.class);
//                startActivity(intent);
//            }
//        });

        Button bronzeButton = (Button)findViewById(R.id.bronzeBtn);
        bronzeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homesilver.this, home.class);
                startActivity(intent);
            }
        });

        Button goldButton = (Button)findViewById(R.id.goldBtn);
        goldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homesilver.this, homegold.class);
                startActivity(intent);
            }
        });
    }
}
