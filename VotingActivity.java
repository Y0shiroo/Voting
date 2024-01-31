package com.example.voting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VotingActivity extends AppCompatActivity {
    TextView voter;
    String pangalan;
    String pres;
    String Vpres;
    EditText presidente;
    EditText visepresi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting);
        voter = findViewById(R.id.votername);
        presidente = findViewById(R.id.president);
        visepresi = findViewById(R.id.vicepresi);
        Intent i = getIntent();
        pangalan = i.getStringExtra("pangalan");
        voter.setText("Hello, " + pangalan + "!");
    }

    public void submit(View view) {
        if (presidente.getText().toString().isEmpty() || visepresi.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please fill up the missing field!", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(this, ResultsActivity.class);
            pres = presidente.getText().toString();
            Vpres = visepresi.getText().toString();
            i.putExtra("pres", pres);
            i.putExtra("Vpres", Vpres);
            i.putExtra("pangalan", pangalan);
            Toast.makeText(this, "Thanks for voting!", Toast.LENGTH_SHORT).show();
            startActivity(i);
            finish();
        }
    }
}
