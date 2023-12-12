package com.hello;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.cdMenu1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent helloworld = new Intent(home.this, MainActivity.class);
                startActivity(helloworld);
            }
        });

        findViewById(R.id.cdMenu2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toast = new Intent(home.this, countActiviy.class);
                startActivity(toast);
            }
        });

        findViewById(R.id.cdMenu3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toast = new Intent(home.this, scrollActivity.class);
                startActivity(toast);
            }
        });

        findViewById(R.id.cdMenu4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toast = new Intent(home.this, SetAlarm.class);
                startActivity(toast);
            }
        });

        findViewById(R.id.cdMenu5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toast = new Intent(home.this, pertamaActivity.class);
                startActivity(toast);
            }
        });

        findViewById(R.id.cdMenu6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toast = new Intent(home.this, MapsActivity.class);
                startActivity(toast);
            }
        });

        findViewById(R.id.cdMenu7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toast = new Intent(home.this, fragmentmain.class);
                startActivity(toast);
            }
        });

    }

    }


