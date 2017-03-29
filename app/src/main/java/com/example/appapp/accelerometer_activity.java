package com.example.appapp;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class accelerometer_activity extends AppCompatActivity  implements SensorEventListener{
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private float axisX;
    private float axisY;
    private float axisZ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer_activity);
        mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

    }

    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    public void onSensorChanged(SensorEvent event) {
        axisX = event.values[0];
        axisY = event.values[1];
        axisZ = event.values[2];

        TextView tv = (TextView) findViewById(R.id.my_text_view); //http://stackoverflow.com/questions/5821051/how-to-display-the-value-of-a-variable-on-the-screen
        tv.setText("Accelerometer: \n X-axis: " + axisX + "\n" + "Y-axis: " + axisY+ "\n" + "Z-axis: " + axisZ);
    }

    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    }

    protected void onPause() {
        super.onPause();
        mSensorManager.unregisterListener(this);
    }
}
