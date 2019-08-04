package com.techjd.insta_fb_twitterlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            TextView text = (TextView) findViewById(R.id.textView);
            text.setMovementMethod(LinkMovementMethod.getInstance());

        button = (Button) findViewById(R.id.button7);
        button1 = (Button) findViewById(R.id.button8);
        button2 = (Button) findViewById(R.id.button9);
        button3 = (Button) findViewById(R.id.button10);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, insta.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, facebook.class);
                startActivity(intent1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, twitter.class);
                startActivity(intent2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this,tumblr.class);
                startActivity(intent3);
            }
        });
    }
}
