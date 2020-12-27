package com.example.lb8;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Info extends Activity {
    private TextView infoText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        infoText = (TextView) findViewById(R.id.infoText);
        infoText.setText(R.string.credentials);
    }
}
