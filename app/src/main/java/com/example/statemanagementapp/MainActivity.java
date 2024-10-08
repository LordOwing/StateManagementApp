package com.example.statemanagementapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static final String KEY_COUNT = "count";
    private TextView textViewCount;
    private int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        textViewCount=findViewById(R.id.textViewCount);
        Button buttonIncrement = findViewById(R.id.buttonIncrement);
        if(savedInstanceState !=null){
            count = savedInstanceState.getInt(KEY_COUNT);
        }
        updateCountText();


    }
}