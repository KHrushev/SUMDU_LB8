package com.example.lb8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercise extends Activity {
    private Button btnActTwo;
    private EditText exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exer);
        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        exercise = (EditText) findViewById(R.id.EXER);

    }
    public void goNewView(View v){
        switch (v.getId()){
            case R.id.btnActTwo:
                Intent intent = new Intent(this, ActiveExercise.class);
                intent.putExtra("Exercise", exercise.getText().toString());
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
