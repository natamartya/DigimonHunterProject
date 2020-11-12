package com.example.projectux;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class patamonDetails extends AppCompatActivity {
    int qtyPatamon;
    Button orderBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patamon_details);
        initPatamon();

        orderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(qtyPatamon < 1 || qtyPatamon > 20){
                    AlertDialog.Builder dialog = new AlertDialog.Builder(patamonDetails.this);
                    dialog.setTitle("Error!");
                    dialog.setMessage("Quantity should be between 1-20!");
                    dialog.show();

                }
                else{
                    AlertDialog.Builder dialog = new AlertDialog.Builder(patamonDetails.this);
                    dialog.setTitle("Congratulations!");
                    dialog.setMessage("You have successfully ordered!");
                    dialog.show();
                }
            }
        });


    }

    private void initPatamon(){
        qtyPatamon = R.id.qtyPatamon;
        orderBtn = findViewById(R.id.orderBtn);
    }
}
