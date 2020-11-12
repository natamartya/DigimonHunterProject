package com.example.uxproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout username;
    private TextInputLayout password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.etUname);
        password = findViewById(R.id.etPassword);
    }

    private boolean validateUsername(){
        String usernameInput = username.getEditText().getText().toString().trim();

        if(usernameInput.isEmpty()){
            username.setError("Username must be filled!");
            return false;
        }
        else if (usernameInput.length() < 5){
            username.setError("Username length must be between 5-20!");
            return false;
        }
        else if (usernameInput.length() > 20){
            username.setError("Username length must be between 5-20!");
            return false;
        }
        else{
            username.setError(null);
            return true;
        }
    }

    private boolean validatePassword(){
        String passwordInput = password.getEditText().getText().toString().trim();

        if(passwordInput.isEmpty()){
            password.setError("Password must be filled!");
            return false;
        }
        else{
            password.setError(null);
            return true;
        }
    }

    public void loginInput(View v){
        if(!validateUsername() | !validatePassword()){
            Intent intent = new Intent(MainActivity.this, home.class);
            startActivity(intent);
        }

        String input = "Username : " + username.getEditText().getText().toString();
        input += "\n";
        input += "Password : " + password.getEditText().getText().toString();

    }

}
