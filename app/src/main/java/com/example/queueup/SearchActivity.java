package com.example.queueup;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;
import java.util.ArrayList;
import java.util.List;

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
        selectGame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                // TODO
            }
        });

        ImageButton selectRank = findViewById(R.id.select_rank_btn);
        selectRank.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                // TODO
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
                Intent intent = new Intent(context, SearchResultActivity.class);
                startActivity(intent);
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
