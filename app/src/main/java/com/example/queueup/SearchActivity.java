package com.example.queueup;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {
    @SuppressLint({"MissingInflatedId", "LocalSuppress"})
    @Override

    public void onCreate(Bundle savedInstanceState) {
        final Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_page);

        // Circular Search Button
        ImageButton searchBtn = findViewById(R.id.search_btn);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                Intent intent = new Intent(context, SearchResultActivity.class);
                startActivity(intent);
            }
        });

        // Filter Buttons
        ImageButton selectGame = findViewById(R.id.select_game_btn);
        Spinner gameSpinner = findViewById(R.id.game_spinner);
        ArrayAdapter<CharSequence> gameAdapter = ArrayAdapter.createFromResource(this,
                R.array.game_dropdown, android.R.layout.simple_spinner_item);
        selectGame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) { // TODO
                gameAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
                gameSpinner.setAdapter(gameAdapter);
            }
        });

        ImageButton selectRank = findViewById(R.id.select_rank_btn);
        Spinner rankSpinner = findViewById(R.id.rank_spinner);
        ArrayAdapter<CharSequence> rankAdapter = ArrayAdapter.createFromResource(this,
                R.array.rank_dropdown, android.R.layout.simple_spinner_item);
        selectRank.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) { // TODO
                rankAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
                rankSpinner.setAdapter(rankAdapter);
            }
        });

        // Navigation Bar Buttons
        ImageButton homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton resultButton = findViewById(R.id.notificationButton);
        resultButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO
            }
        });

        // TODO: chat button

        ImageButton profileButton = findViewById(R.id.profileButton);
        profileButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(context, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
