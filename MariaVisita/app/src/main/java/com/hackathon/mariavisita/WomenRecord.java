package com.hackathon.mariavisita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Spinner;

public class WomenRecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women_record);

        Button womanImg = (Button) findViewById(R.id.woman_img);
        Button visitImg = (Button) findViewById(R.id.visit_img);
        Button mapImg = (Button) findViewById(R.id.map_img);

        final Intent iWoman = new Intent(this, WomenRecord.class);
        final Intent iVisit = new Intent(this, VisitRecord.class);
        final Intent iMap = new Intent(this, MapsActivity.class);

        womanImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(iWoman);
            }
        });

        visitImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(iVisit);
            }
        });

        mapImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(iMap);
            }
        });

        Button saveBtn = (Button) findViewById(R.id.atteded_save);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText) findViewById(R.id.attended_name);
                EditText city = (EditText) findViewById(R.id.attended_city);
                EditText address = (EditText) findViewById(R.id.attended_address);
                EditText neiborhood = (EditText) findViewById(R.id.atteded_neighborhoodn);
                EditText process = (EditText) findViewById(R.id.atteded_process);
                EditText policecar = (EditText) findViewById(R.id.atteded_policecar);
                EditText phone = (EditText) findViewById(R.id.atteded_phone);
                Spinner risklevel = (Spinner) findViewById(R.id.atteded_risk_level);
                EditText period = (EditText) findViewById(R.id.atteded_visit_period);
            }
        });
    }
}
