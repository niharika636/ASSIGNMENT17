package com.example.sahil.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class login_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        final Button Login=findViewById(R.id.login);extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_login_form);

        final EditText name=findViewById(R.id.username);
        final  EditText passwor=findViewById(R.id.password);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getSharedPreferences("MySharedPrefs",MODE_PRIVATE);
                String str1=sharedPreferences.getString("username: ","");
                String str2=sharedPreferences.getString("password: ","");
                if(str1.compareTo(name.getText().toString())==0 && str2.compareTo(passwor.getText().toString())==0)
                {
                    Intent i = new Intent(login_form.this, home.class);
                    startActivity(i);
                }
                else
                    Toast.makeText(LogIn.this,"Enter Valid Details!",Toast.LENGTH_LONG).show();

            }
        });

    }

}