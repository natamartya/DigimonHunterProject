package com.example.uxproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton logoutButton = (ImageButton)findViewById(R.id.logoutBtn);
        logoutButton.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentL = new Intent(home.this, MainActivity.class);
                startActivity(intentL);
                finish();
                Toast.makeText(home.this, "Successfully Logout", Toast.LENGTH_SHORT).show();
            }
        });

//        ImageButton digimonButton = (ImageButton)findViewById(R.id.digimonBtn);

//        digimonButton.setOnClickListener (new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                Intent intentL = new Intent(home.this, digimonPage.class);
//                startActivity(intentL);
//            }
//        });
//
//        ImageButton contactusButton = (ImageButton)findViewById(R.id.contactusBtn);
//
//        contactusButton.setOnClickListener (new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                Intent intentL = new Intent(home.this, contactusPage.class);
//                startActivity(intentL);
//            }
//        });

        Button silverButton = (Button)findViewById(R.id.silverBtn);

        silverButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intentL = new Intent(home.this, homesilver.class);
                startActivity(intentL);
            }
        });

        Button goldButton = (Button)findViewById(R.id.goldBtn);

        goldButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intentL = new Intent(home.this, homegold.class);
                startActivity(intentL);
            }
        });
    }


}
