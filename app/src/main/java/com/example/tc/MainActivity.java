package com.example.tc;



import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Kelvin(View v) {
        EditText et1 = (EditText)findViewById(R.id.editTextNumber);
        int n1 = Integer.parseInt(et1.getText().toString());
        TextView txt = findViewById(R.id.textView);
        float result = n1 + 273.15f;

        txt.setText("Answer: " + result + "K");

    }
    public void Fahrenheit (View v) {
        EditText et1 = (EditText)findViewById(R.id.editTextNumber);
        int n1 = Integer.parseInt(et1.getText().toString());
        TextView txt = findViewById(R.id.textView);
        float result = (n1 * 1.8f) + 32f;

        txt.setText("Answer: " + result + "°F");

    }
}