package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText etStuID,etPassword;
    public Button btnLogin,btnRegister;
    String Credentials;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        etStuID = (EditText)findViewById(R.id.etStuID);
//        etPassword =(EditText) findViewById(R.id.etPassword);
//        btnLogin = (Button) findViewById(R.id.btnRegister);
//        btnRegister = (Button) findViewById(R.id.btnRegister);


//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (etStuID.getText().toString().equals(etStuID) &&  etPassword.getText().toString().equals(etPassword))
//                {
//                    Toast.makeText(getApplicationContext(),"Professor Kiani",Toast.LENGTH_SHORT).show();
//
//
//                }
//        }});
//
//        btnRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String email = etStuID.getText().toString().trim();
//                String password = etPassword.getText().toString().trim();
//
//                if (email.isEmpty() || password.isEmpty()) {
//                    Toast.makeText(MainActivity.this, "Please Enter required field", Toast.LENGTH_SHORT).show();
//                } else
//                    {
//                        Credentials = etStuID.getText().toString();
//                        Credentials = etPassword.getText().toString();
//
//
//                }
//            }});
//
   }




    }

