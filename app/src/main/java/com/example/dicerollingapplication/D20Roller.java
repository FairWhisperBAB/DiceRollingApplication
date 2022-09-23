package com.example.dicerollingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class D20Roller extends AppCompatActivity {

    private ImageView imageViewDice;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d20_roller);

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
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.d20_2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.d20_3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.d20_4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.d20_5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.d20_6);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.d20_7);
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.d20_8);
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.d20_9);
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.d20_10);
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.d20_11);
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.d20_12);
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.d20_13);
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.d20_14);
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.d20_15);
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.d20_16);
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.d20_17);
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.d20_18);
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.d20_19);
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.d20_20);
                break;
        }
    }
}