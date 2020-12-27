package com.example.lb8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.FragmentTransaction;

public class ActiveExercise extends Activity {
    StopwatchFragment frag1;
    FragmentTransaction fTrans;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actex);
        frag1 = new StopwatchFragment();

        TextView ex = (TextView) findViewById(R.id.Ex);
        String exName = getIntent().getStringExtra("Exercise");
        ex.setText(ex.getText().toString() + " " + exName);
    }
    public void onClick(View v){
        fTrans = getFragmentManager().beginTransaction();
        switch (v.getId()) {
            case R.id.btn_st_frag:
                fTrans.add(R.id.frgmCont, frag1);
            default:
                break;
        }
        fTrans.commit();
    }
}
