package com.tbcmad.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText Username;
    private EditText Password;
    private TextView Info;
    Button Login;
    private int counter = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = (EditText) findViewById(R.id.Etusername);
        Password = (EditText) findViewById(R.id.Etpassword);
        Login = (Button) findViewById(R.id.login_activity_btn_login);


        Info.setText("No. of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Username.getText().toString(), Password.getText().toString());
            }

        });
    }


            private void validate(String Username, String Password){
                if ((Username == "Samrat") && (Password == "1234" )) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);

                }else {
                    counter--;
                    Info.setText("No. of attempts remaining:" + String.valueOf(counter));

                    if (counter == 0){
                        Login.setEnabled(false);
                    }
                }

            }

            }
