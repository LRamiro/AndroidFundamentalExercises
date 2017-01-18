package com.example.ramiro.applicationofsecondclass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by ramiro on 16/01/17.
 */
public class ActivityD extends AppCompatActivity {

    EditText editTextActivityD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        editTextActivityD = (EditText)findViewById(R.id.editTextD);
        editTextActivityD.setText("Activity D");

    }
}

