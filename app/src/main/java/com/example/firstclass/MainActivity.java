package com.example.firstclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton radioButton1,radioButton2,radioButton3;

    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1 = findViewById(R.id.rbBird);
        radioButton2 = findViewById(R.id.rbSnake);

        radioButton3 = findViewById(R.id.rbTiger);
        imageView = findViewById(R.id.ivShow);

        radioButton1.setOnClickListener(this);
       radioButton2.setOnClickListener(this);
       radioButton3.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rbBird:
                imageView.setImageResource(R.drawable.bird);
                break;

            case R.id.rbSnake:
                imageView.setImageResource(R.drawable.snake);
                break;

            case R.id.rbTiger:
                imageView.setImageResource(R.drawable.tiger);
                break;


        }}

}
