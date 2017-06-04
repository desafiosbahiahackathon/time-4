package com.hackathon.mariavisita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class VisitRecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit_record);

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
    }
}
