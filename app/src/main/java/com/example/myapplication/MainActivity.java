package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    AppCompatTextView txt_output;
    String[] l1 = new String[]{"9", "9", "9", "9", "9", "9", "9"};
    String[] l2 = new String[]{"9", "9", "9", "9"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_output = findViewById(R.id.txt_output);
        sumTwoList();
    }

    private void sumTwoList() {
        String strL1 = reverseTheList(l1);
        String strL2 = reverseTheList(l2);
        int sum = Integer.parseInt(strL1) + Integer.parseInt(strL2);
        String[] sumArray = String.valueOf(sum).split("");
        String reverseTheSum = reverseTheList(sumArray);
        String[] output = reverseTheSum.split("");

        txt_output.setText("Output : " + Arrays.toString(output));
    }

    private String reverseTheList(String[] list) {
        StringBuilder builder = new StringBuilder();
        for (int i = list.length - 1; i >= 0; i--) {
            builder.append(list[i]);
        }
        return builder.toString();
    }
}