package com.example.avinashbanala.assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Page extends AppCompatActivity {
    Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        final EditText user = (EditText) findViewById(R.id.user);
        final EditText pwd = (EditText) findViewById(R.id.pwd);
        final Button button = (Button) findViewById(R.id.button);
        final Button button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent signupIntent = new Intent(Login_Page.this, REGISTER_PAGE.class);
                                           Login_Page.this.startActivity(signupIntent);
                                       }
                                   });
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(user.getText().toString().equals("username") && pwd.getText().toString().equals("username")) {
                            Intent loginIntent = new Intent(Login_Page.this, MainActivity.class);
                            Login_Page.this.startActivity(loginIntent);
                        }
                        else
                            Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_SHORT).show();


            }
        });
    }
}
