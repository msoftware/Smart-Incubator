package com.v1rex.smartincubator.Activities;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.v1rex.smartincubator.R;

public class MainActivity extends AppCompatActivity {

    Button mLoginBtn;
    Button mRegisterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        mLoginBtn = (Button) findViewById(R.id.login_btn);

        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);


            }
        });

        mRegisterBtn = (Button) findViewById(R.id.register_btn);

        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);

            }
        });


    }
}