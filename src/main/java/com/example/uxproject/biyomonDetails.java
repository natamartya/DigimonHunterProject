package com.example.projectux;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class biyomonDetails extends AppCompatActivity {
    int qty;
    Button orderBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biyomon_details);
        initBiyomon();
        orderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(qty < 1 || qty > 20){
                    AlertDialog.Builder dialog = new AlertDialog.Builder(biyomonDetails.this);
                    dialog.setTitle("Error!");
                    dialog.setMessage("Quantity should be between 1-20!");
                    dialog.show();

                }
                else{
                    AlertDialog.Builder dialog = new AlertDialog.Builder(biyomonDetails.this);
                    dialog.setTitle("Congratulations!");
                    dialog.setMessage("You have successfully ordered!");
                    dialog.show();
                }
            }
        });
    }

    private void initBiyomon(){
        qty = R.id.qty4;
        orderBtn = findViewById(R.id.orderBtn4);
    }

}
