package com.example.voting;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    int int_age;
    EditText et_age;
    EditText Voter;
    String pangalan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_age = findViewById(R.id.age);
        Voter = findViewById(R.id.voter);
    }
    public void submit(View view){

        if (et_age.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter your age.", Toast.LENGTH_SHORT).show();
        }
        else {
            int_age = Integer.parseInt(et_age.getText().toString());
            if (int_age <= 17){
                Toast.makeText(this, "You cannot vote.", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "You can vote.", Toast.LENGTH_SHORT).show();
                pangalan = Voter.getText().toString();
                Intent i = new Intent(this, VotingActivity.class);
                i.putExtra("pangalan",pangalan);
                startActivity(i);
                finish();
            }
        }
    }
}
