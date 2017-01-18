package com.example.ramiro.applicationofsecondclass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by ramiro on 16/01/17.
 */
public class ActivityC extends AppCompatActivity {

    EditText editTextActivityC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        editTextActivityC = (EditText)findViewById(R.id.editTextC);
        editTextActivityC.setText("Activity C");

    }
}