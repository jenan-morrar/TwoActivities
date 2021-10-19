package com.example.towactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
    private TextView txtShowMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();

        txtShowMessage = findViewById(R.id.txtShowMessage);
        String msg = intent.getStringExtra("data");
        txtShowMessage.setText(msg);

    }
}