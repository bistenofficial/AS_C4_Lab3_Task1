package com.example.as_c4_lab3_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

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
        Intent intentSign = new Intent(this, Menu.class);
        startActivity(intentSign);
    }
}