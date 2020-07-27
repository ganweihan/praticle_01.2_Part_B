package com.example.praticle_2_part_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class next_page extends AppCompatActivity {
TextView word, hellow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);
        word=findViewById(R.id.show_word);
        hellow=findViewById(R.id.textView2);
        Intent intent=getIntent();
        word.setText(intent.getStringExtra("count").toString());
        hellow.setText(intent.getStringExtra("hello").toString());

    }
}