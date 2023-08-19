package com.example.selfassessmentadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow() .setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openSplashScreen2Activity(); }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openSplashScreenActivity(); }
        });

    }

    public void openSplashScreen2Activity() {
        Intent intent = new Intent(this,SplashScreen2Activity.class);
        startActivity(intent);
    }

    public void openSplashScreenActivity() {
        Intent intent = new Intent(this,SplashScreenActivity.class);
        startActivity(intent);
    }

}