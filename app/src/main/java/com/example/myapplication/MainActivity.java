package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button button;
        TextView textView;
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone_number = textView.getText().toString();
                Intent phone_intent = new Intent(Intent.ACTION_CALL);
                Uri number = Uri.parse("tel:5551234");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(phone_intent);
            }
        });

    }
}