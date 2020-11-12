package com.example.uxproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class homegold extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homegold);

        ImageButton logoutButton = (ImageButton)findViewById(R.id.logoutBtn);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentI = new Intent(homegold.this, MainActivity.class);
                startActivity(intentI);
                finish();
                Toast.makeText(homegold.this, "Successfully Logout", Toast.LENGTH_SHORT).show();
            }
        });

//        ImageButton digimonButton = (ImageButton)findViewById(R.id.digimonBtn);
//        digimonButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intentI = new Intent(homegold.this, digimonPage.class);
//                startActivity(intentI);
//            }
//        });
//
//        ImageButton contactusButton = (ImageButton)findViewById(R.id.contactusBtn);
//        contactusButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intentI = new Intent(homegold.this, contactusPage.class);
//                startActivity(intentI);
//            }
//        });

        Button bronzeButton = (Button) findViewById(R.id.bronzeBtn);
        bronzeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentI = new Intent(homegold.this, home.class);
                startActivity(intentI);
            }
        });

        Button silverButton = (Button) findViewById(R.id.silverBtn);
        silverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentI = new Intent(homegold.this, homesilver.class);
                startActivity(intentI);
            }
        });
    }
}
