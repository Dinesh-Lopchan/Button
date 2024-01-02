package com.example.button;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;
    Button button, button2, button3, button4;
    TextView Mid, Top, Bot;
    Handler handler = new Handler();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing UI components
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        imageButton = findViewById(R.id.imagebutton);
        Top = findViewById(R.id.Top);
        Bot = findViewById(R.id.Bot);
        Mid = findViewById(R.id.Mid);

        // Initializing text for text views
        Top.setText("");
        Mid.setText("");
        Bot.setText("");

        //click listener for the top button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //display top left is clicked when button is clicked
                Top.setText("Top Left is clicked");
                //handler is used to clear the texts faster
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Top.setText("");
                    }
                }, 1500);

            }
        });

        //click listener for the top button
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //display top right is clicked when button is clicked
                Top.setText("Top Right is clicked");
                //handler is used to clear the texts faster
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Top.setText("");
                    }
                }, 1500);

            }
        });


        //click listener for the bottom button
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //display bottom left is clicked when button is clicked
                Bot.setText("Bottom Left is clicked");
                //handler is used to clear the texts faster
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Bot.setText("");
                    }
                }, 1500);

            }
        });

        //click listener for the bottom button
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //display bottom right is clicked when button is clicked
                Bot.setText("Bottom right is clicked");
                //handler is used to clear the texts faster
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Bot.setText("");
                    }
                }, 1500);

            }
        });

        //click listener for the image button
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //display image is clicked when button is clicked
                Mid.setText("Image is clicked");
                //handler is used to clear the texts faster
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Mid.setText("");
                    }
                }, 1500);

            }
        });

    }
}

