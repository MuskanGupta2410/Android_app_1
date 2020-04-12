package com.example.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button point3=(Button) findViewById(R.id.b1);
        point3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView team1=findViewById(R.id.team1);
                int before1=Integer.parseInt(team1.getText().toString());
                int final1=before1 + 3;
                team1.setText(Integer.toString(final1));


            }


        });
        Button point2=(Button) findViewById(R.id.b2);
        point2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView team1=findViewById(R.id.team1);
                int before1=Integer.parseInt(team1.getText().toString());
                int final1=before1 + 2;
                team1.setText(Integer.toString(final1));


            }


        });
        Button point1=(Button) findViewById(R.id.b3);
        point1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView team1=findViewById(R.id.team1);
                int before1=Integer.parseInt(team1.getText().toString());
                int final1=before1 + 1;
                team1.setText(Integer.toString(final1));


            }


        });
        Button point31=(Button) findViewById(R.id.b4);
        point31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView team2=findViewById(R.id.team2);
                int before2=Integer.parseInt(team2.getText().toString());
                int final2=before2 + 3;
                team2.setText(Integer.toString(final2));


            }


        });
        Button point21=(Button) findViewById(R.id.b5);
        point21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView team2=findViewById(R.id.team2);
                int before2=Integer.parseInt(team2.getText().toString());
                int final2=before2 + 3;
                team2.setText(Integer.toString(final2));


            }


        });
        Button point11=(Button) findViewById(R.id.b6);
        point11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView team2=findViewById(R.id.team2);
                int before2=Integer.parseInt(team2.getText().toString());
                int final2=before2 + 3;
                team2.setText(Integer.toString(final2));


            }


        });
        Button reset=(Button) findViewById(R.id.b7);
        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView team1=findViewById(R.id.team1);
                int before3=Integer.parseInt(team1.getText().toString());
                int final3=0;
                team1.setText(Integer.toString(final3));
                TextView team2=findViewById(R.id.team2);
                int before4=Integer.parseInt(team1.getText().toString());
                int final4=0;
                team2.setText(Integer.toString(final4));

            }
        });
    }
}