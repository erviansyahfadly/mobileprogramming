package com.example.erviansyahf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView ivsetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        ivsetting = findViewById(R.id.icSetting);
        ivsetting.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent setting = new Intent(MainActivity.this,app_setting.class);
        startActivity(setting);
    }
}

