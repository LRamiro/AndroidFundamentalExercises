package com.example.ramiro.applicationofsecondclass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by ramiro on 16/01/17.
 */
public class ActivityE extends AppCompatActivity {

    EditText editTextActivityE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e);
        editTextActivityE = (EditText)findViewById(R.id.editTextE);
        editTextActivityE.setText("Activity E");

    }
}
