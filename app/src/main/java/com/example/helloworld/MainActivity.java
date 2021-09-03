package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView greetings;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greetings = (TextView) findViewById(R.id.tvGreatings);
        click = (Button) findViewById(R.id.btn);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                greetings.setVisibility(view.VISIBLE);
            }
        });
    }
}