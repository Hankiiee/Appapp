package com.example.appapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, accelerometer_activity.class);
       // EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
       // intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void compass(View view) {
        Intent intent = new Intent(this, compass_activity.class);
        // EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
        // intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
