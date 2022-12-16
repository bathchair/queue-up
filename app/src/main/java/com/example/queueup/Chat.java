package com.example.queueup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Chat extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);
    }
    public void goChat(View v){
        startActivity(new Intent(Chat.this,ChatPage.class));
    }
    public void onClick(View v) {
        startActivity(new Intent(Chat.this, MainActivity.class));

    }
}
