package com.example.dicerollingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectionScreen extends AppCompatActivity {

    public Intent D6Intent;
    public Intent D20Intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_screen);
    }

    public void GoToD6 (View view)
    {
        D6Intent = new Intent(this, MainActivity.class);

        startActivity(D6Intent);
    }

    public void GoToD20 (View view)
    {
        D20Intent = new Intent(this, D20Roller.class);

        startActivity(D20Intent);
    }
}