package com.example.voting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    TextView voter;
    TextView president;
    TextView vicepresi;
    String pangalan;
    String pres;
    String Vpres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        voter = findViewById(R.id.votername);
        president = findViewById(R.id.president);
        vicepresi = findViewById(R.id.vicepresi);
        Intent i = getIntent();
        pangalan = i.getStringExtra("pangalan");
        pres = i.getStringExtra("pres");
        Vpres = i.getStringExtra("Vpres");
        voter.setText("Hello, " + pangalan + "!");
        president.setText("President: "+ pres);
        vicepresi.setText("VP: "+ Vpres);

    }
}
