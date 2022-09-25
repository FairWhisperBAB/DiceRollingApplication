package com.example.dicerollingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class D20Roller extends AppCompatActivity {

    private ImageView imageViewDice;
    private Random rng = new Random();

    String EpicWin = "CRITICAL HIT!! XD";
    String EpicFail = "CRITICAL FAIL!! :(";

    private TextView roll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_d20_roller);

        roll = (TextView) findViewById(R.id.textView3);

        imageViewDice = findViewById(R.id.image_view_d20);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(20) + 1;

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.d20_1);

                roll.setText(EpicFail);

                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.d20_2);

                roll.setText(" ");

                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.d20_3);

                roll.setText(" ");

                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.d20_4);

                roll.setText(" ");

                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.d20_5);

                roll.setText(" ");

                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.d20_6);

                roll.setText(" ");

                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.d20_7);

                roll.setText(" ");

                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.d20_8);

                roll.setText(" ");

                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.d20_9);

                roll.setText(" ");

                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.d20_10);

                roll.setText(" ");

                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.d20_11);

                roll.setText(" ");

                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.d20_12);

                roll.setText(" ");

                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.d20_13);

                roll.setText(" ");

                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.d20_14);

                roll.setText(" ");

                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.d20_15);

                roll.setText(" ");

                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.d20_16);

                roll.setText(" ");

                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.d20_17);

                roll.setText(" ");

                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.d20_18);

                roll.setText(" ");

                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.d20_19);

                roll.setText(" ");

                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.d20_20);

                roll.setText(EpicWin);

                break;
        }
    }
}