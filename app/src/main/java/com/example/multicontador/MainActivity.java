package com.example.multicontador;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
    private int globalCount = 0;

    private TextView tvCounter1, tvCounter2, tvCounter3, tvCounter4, tvGlobalCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCounter1 = findViewById(R.id.tvCounter1);
        tvCounter2 = findViewById(R.id.tvCounter2);
        tvCounter3 = findViewById(R.id.tvCounter3);
        tvCounter4 = findViewById(R.id.tvCounter4);
        tvGlobalCounter = findViewById(R.id.tvGlobalCounter);

        Button btnAdd1 = findViewById(R.id.btnAdd1);
        Button btnReset1 = findViewById(R.id.btnReset1);

        Button btnAdd2 = findViewById(R.id.btnAdd2);
        Button btnReset2 = findViewById(R.id.btnReset2);

        Button btnAdd3 = findViewById(R.id.btnAdd3);
        Button btnReset3 = findViewById(R.id.btnReset3);

        Button btnAdd4 = findViewById(R.id.btnAdd4);
        Button btnReset4 = findViewById(R.id.btnReset4);

        Button btnResetAll = findViewById(R.id.btnResetAll);

        btnAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1++;
                globalCount++;
                updateCounters();
            }
        });

        btnReset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalCount -= count1;
                count1 = 0;
                updateCounters();
            }
        });

        btnAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2++;
                globalCount++;
                updateCounters();
            }
        });

        btnReset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalCount -= count2;
                count2 = 0;
                updateCounters();
            }
        });

        btnAdd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count3++;
                globalCount++;
                updateCounters();
            }
        });

        btnReset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalCount -= count3;
                count3 = 0;
                updateCounters();
            }
        });

        btnAdd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count4++;
                globalCount++;
                updateCounters();
            }
        });

        btnReset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalCount -= count4;
                count4 = 0;
                updateCounters();
            }
        });

        btnResetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1 = 0;
                count2 = 0;
                count3 = 0;
                count4 = 0;
                globalCount = 0;
                updateCounters();
            }
        });
    }

    private void updateCounters() {
        tvCounter1.setText(String.valueOf(count1));
        tvCounter2.setText(String.valueOf(count2));
        tvCounter3.setText(String.valueOf(count3));
        tvCounter4.setText(String.valueOf(count4));
        tvGlobalCounter.setText(String.valueOf(globalCount));
    }
}
