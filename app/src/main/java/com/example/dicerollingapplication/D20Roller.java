package com.example.dicerollingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class D20Roller extends AppCompatActivity implements SensorEventListener {

    private ImageView imageViewDice;
    private Random rng = new Random();

    String EpicWin = "CRITICAL HIT!! XD";
    String EpicFail = "CRITICAL FAIL!! :(";

    private TextView roll;

    public MediaPlayer SFX;

    private SensorManager sensorManager;
    private Sensor accelerometerSensor;
    private boolean isAccelerometerSensorAvailable, itIsNotFirstTime = false;
    private float currentX, currentY, currentZ, lastX, lastY, lastZ, xDifference, yDifference, zDifference, shakeTreshHold = 5f;

    private Vibrator vibrator;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_d20_roller);

        roll = (TextView) findViewById(R.id.textView3);

        imageViewDice = findViewById(R.id.image_view_d20);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                rollDice();
                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll2);
                SFX.start();
            }
        });

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        if (sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) != null)
        {
            accelerometerSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
            isAccelerometerSensorAvailable = true;
        }
        else
        {
            isAccelerometerSensorAvailable = false;
        }

        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

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

                SFX = MediaPlayer.create(D20Roller.this, R.raw.nat20);
                SFX.start();

                break;
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        currentX = sensorEvent.values[0];
        currentY = sensorEvent.values[1];
        currentZ = sensorEvent.values[2];

        if (itIsNotFirstTime)
        {
            xDifference = Math.abs(lastX - currentX);
            yDifference = Math.abs(lastY - currentY);
            xDifference = Math.abs(lastZ - currentZ);

            if ((xDifference > shakeTreshHold && yDifference > shakeTreshHold) ||
            (xDifference > shakeTreshHold && zDifference > shakeTreshHold) ||
                    (yDifference > shakeTreshHold && zDifference > shakeTreshHold))
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
                {
                    vibrator.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else
                {
                    vibrator.vibrate(500);

                }

                rollDice();
                SFX = MediaPlayer.create(D20Roller.this, R.raw.roll1);
                SFX.start();
            }
        }

        lastX = currentX;
        lastY = currentY;
        lastZ = currentZ;

        itIsNotFirstTime = true;
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    protected void onResume() {
        super.onResume();

        if (isAccelerometerSensorAvailable)
        {
            sensorManager.registerListener(this, accelerometerSensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        if (isAccelerometerSensorAvailable)
        {
            sensorManager.unregisterListener(this);
        }
    }
}