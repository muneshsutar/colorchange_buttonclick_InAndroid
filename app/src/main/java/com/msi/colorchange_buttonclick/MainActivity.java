package com.msi.colorchange_buttonclick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button click;
    ConstraintLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        click  = findViewById(R.id.click);
        linear = findViewById(R.id.linear);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linear.setBackgroundColor(Color.WHITE);
                text.setBackgroundColor(Color.RED);
                text.setTextColor(Color.GREEN);
            }
        });
    }
}