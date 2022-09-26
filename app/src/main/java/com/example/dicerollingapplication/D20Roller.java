package com.example.dicerollingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
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

    public MediaPlayer SFX;


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

                SFX = MediaPlayer.create(D20Roller.this, R.raw.nat1);
                SFX.start();

                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.d20_2);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.d20_3);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.d20_4);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.d20_5);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.d20_6);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.d20_7);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.d20_8);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.d20_9);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.d20_10);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.d20_11);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.d20_12);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.d20_13);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.d20_14);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.d20_15);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.d20_16);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.d20_17);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.d20_18);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.d20_19);

                roll.setText(" ");

                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();

                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.d20_20);

                roll.setText(EpicWin);

                SFX = MediaPlayer.create(D20Roller.this, R.raw.nat20);
                SFX.start();

                break;
        }
    }
}