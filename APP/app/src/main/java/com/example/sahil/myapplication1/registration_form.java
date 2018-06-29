package com.example.sahil.myapplication1;

public class registration_form extends AppCompatActivity  {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);
        final Button login=findViewById(R.id.login);
        Button register=findViewById(R.id.register);
        final EditText name=findViewById(R.id.Name);
        final EditText name=findViewById(R.id.username);
        final EditText verifyPass=findViewById(R.id.VerifyPass);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((password.getText().toString()).equals(verifyPass.getText().toString()))==false)
                {
                    Toast.makeText(RegisterActivity.this,"Please enter the same password in verifying box",Toast.LENGTH_LONG).show();
                }
                else if(((name.getText().toString()).compareTo("")!=0)&&
                        ((password.getText().toString()).compareTo("")!=0))
                {

                    SharedPreferences sharedPreferences=getSharedPreferences("MySharedPrefs",MODE_PRIVATE);
                    String Name=name.getText().toString();
                    String Password=password.getText().toString();


                    SharedPreferences.Editor editor= sharedPreferences.edit();
                    editor.putString("Name: ", Name);
                    editor.putString("Password: ",Password);
                    Log.i("ButtonClicked",username);
                    editor.commit();
                    Toast.makeText(RegisterActivity.this,"REGISTERED Scessfully!",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(RegisterActivity.this,MainActivity.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(RegisterActivity.this,"Please Fill the All Fields.",Toast.LENGTH_LONG).show();
            }
        });
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(register_form.this,login_form.class);
                startActivity(intent);
            }
        });
    }
}