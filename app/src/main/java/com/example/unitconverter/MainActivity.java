package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        textView = findViewById(R.id.textView6);
        editText = findViewById(R.id.editText);
            Log.d("General" , "THis app is working properly");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Converting...", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int mile = Integer.parseInt(s);
                double km =  (1.609344 * mile);
                textView.setText("Value in Km is " + km);
                Log.d("General" , "THis button is working properly"); // this is log which can be checked under logcat section down below by searching tag name "General

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    // OR WE CAN USE THIS CODE INSTEAD OF setOnclicklistener and we gotta write in xml button section android:onClick="converter"
//    public void converter(View view){
//        Toast.makeText(MainActivity.this, "Converting...", Toast.LENGTH_SHORT).show();
//        String s = editText.getText().toString();
//        int mile = Integer.parseInt(s);
//        double km =  (1.609344 * mile);
//        textView.setText("Value in Km is " + km);
//
//    }

}
