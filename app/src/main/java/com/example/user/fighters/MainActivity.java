package com.example.user.fighters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Fighter firstFighter;
    Fighter secondFighter;
    Button firstFighterAttack;
    Button secondFighterAttack;
    TextView firstFighterName;
    TextView secondFighterName;
    TextView winner;
    TextView action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstFighter = new Fighter(10, 8, 100, "Bruce Lee");
        secondFighter = new Fighter(15, 15, 100, "Jet Lee");

        firstFighterAttack.setOnClickListener();






    }
}
