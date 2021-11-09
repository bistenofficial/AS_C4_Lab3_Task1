package com.example.as_c4_lab3_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);;
    }


    public void onClickSignUp(View view)
    {
        Intent intentSignUp = new Intent(this, SignUp.class);
        startActivity(intentSignUp);
    }
    public void onClickSign(View view)
    {
        Toast toast;
        EditText editTextMail = (EditText) findViewById(R.id.editTextMail);
        EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        boolean valid = validate(editTextMail.getText().toString());
        if(editTextMail.getText().toString().isEmpty()||editTextPassword.getText().toString().isEmpty()) {
            toast = Toast.makeText(getApplicationContext(),"Одно из полей пустое",Toast.LENGTH_SHORT);
            toast.show();
        }
        else
            {
if (valid == false)
{
    toast = Toast.makeText(getApplicationContext(),"Не правильно набран Email",Toast.LENGTH_SHORT);
    toast.show();
}
else
{
    Intent intentSign = new Intent(this, Menu.class);
    startActivity(intentSign);
}
        }
    }
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
}