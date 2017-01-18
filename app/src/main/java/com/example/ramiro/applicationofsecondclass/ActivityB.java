package com.example.ramiro.applicationofsecondclass;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * Created by ramiro on 16/01/17.
 */
public class ActivityB extends AppCompatActivity {
    Button activityCButton;
    Button activityDButton;
    Button activityEButton;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        activityCButton = (Button)findViewById(R.id.button1);
        activityDButton = (Button)findViewById(R.id.button2);
        activityEButton = (Button)findViewById(R.id.button3);
        editText = (EditText) findViewById(R.id.editText);
        activityCButton.setOnClickListener(onClickListener);
        activityDButton.setOnClickListener(onClickListener);
        activityEButton.setOnClickListener(onClickListener);
        Intent j = this.getIntent();
        int positionFromGridView = j.getIntExtra("Position", -1);
        editText.setText("La figura seleccionada fue la " + positionFromGridView);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.button1:
                    lanzarNuevaActividad(activityCButton.getText());
                    break;
                case R.id.button2:
                    lanzarNuevaActividad(activityDButton.getText());
                    break;
                case R.id.button3:
                    lanzarNuevaActividad(activityEButton.getText());
                    break;
            }

        }
    };

    public void lanzarNuevaActividad(CharSequence string){
        Intent i = new Intent();
        if(string.toString().equals("Activity C")) {
            i.setClass(this, ActivityC.class);
        }else if (string.toString().equals("Activity D")){
            i.setClass(this, ActivityD.class);
        }else {
            i.setClass(this, ActivityE.class);
        }

        startActivity(i);

    }

}
