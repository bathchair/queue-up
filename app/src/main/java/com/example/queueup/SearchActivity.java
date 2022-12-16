package com.example.queueup;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.SeekBar;
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
        searchBtn.setOnClickListener(V -> {
            Intent intent = new Intent(context, SearchResultActivity.class);
            startActivity(intent);
        });

        // Filter Buttons
        Spinner gameSpinner = findViewById(R.id.game_spinner);
        ArrayAdapter<CharSequence> gameAdapter = ArrayAdapter.createFromResource(this,
                R.array.game_dropdown, R.layout.spinner);
        gameSpinner.setSelection(0);
        gameSpinner.setAdapter(gameAdapter);
        gameSpinner.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent e) {
                if (e.getAction() == MotionEvent.ACTION_UP) {
                    gameAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
                    gameSpinner.setAdapter(gameAdapter);
                }
                return false;
            }
        });

        Spinner rankSpinner = findViewById(R.id.rank_spinner);
        ArrayAdapter<CharSequence> rankAdapter = ArrayAdapter.createFromResource(this,
                R.array.rank_dropdown, R.layout.spinner);
        rankSpinner.setSelection(0);
        rankSpinner.setAdapter(rankAdapter);
        rankSpinner.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent e) {
                if (e.getAction() == MotionEvent.ACTION_UP) {
                    rankAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
                    rankSpinner.setAdapter(rankAdapter);
                }
                return false;
            }
        });

        // Location & Age SeekBars
        SeekBar locationSeek = (SeekBar) findViewById(R.id.locationSeekBar);
        locationSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int currRange = locationSeek.getProgress();
            public void onProgressChanged(SeekBar s, int p, boolean fromUser) {
                currRange = p;
            }
            public void onStartTrackingTouch(SeekBar seekBar) {}

            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        SeekBar ageSeek = (SeekBar) findViewById(R.id.ageSeekBar);
        ageSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int currRange = ageSeek.getProgress();
            public void onProgressChanged(SeekBar s, int p, boolean fromUser) {
                currRange = p;
            }
            public void onStartTrackingTouch(SeekBar seekBar) {}

            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        // Navigation Bar Buttons
        ImageButton homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(context, MainActivity.class);
            startActivity(intent);
        });

        ImageButton resultButton = findViewById(R.id.notificationButton);
        resultButton.setOnClickListener(v -> {
            // TODO: notification button
        });

        // TODO: chat button

        ImageButton profileButton = findViewById(R.id.profileButton);
        profileButton.setOnClickListener(v -> {
            Intent intent = new Intent(context, ProfileActivity.class);
            startActivity(intent);
        });
    }
}
