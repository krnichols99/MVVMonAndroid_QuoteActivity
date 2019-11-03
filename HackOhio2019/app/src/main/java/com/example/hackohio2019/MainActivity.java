package com.example.hackohio2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = (Button)findViewById((R.id.btnLogin));
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent loginIntent = new Intent(getApplicationContext(),login_page.class);
                startActivity(loginIntent);
            }
        });

        Button btnSignUp = (Button)findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent signUpIntent = new Intent(getApplicationContext(),signup_page.class);
                startActivity(signUpIntent);
            }
        });

    }
}
