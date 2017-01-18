package com.example.ramiro.applicationofsecondclass;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;

import com.example.ramiro.applicationofsecondclass.utils.Adapter;

public class ActivityA extends AppCompatActivity {

    public Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new Adapter(this));
        i = new Intent(this, ActivityB.class);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                lanzarNuevaActividad(position);
            }
        });
    }


    public void lanzarNuevaActividad(int position){
        i.putExtra("Position", position);
        startActivity(i);
   }



}