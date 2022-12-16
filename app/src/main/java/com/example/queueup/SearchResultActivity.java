package com.example.queueup;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableLayout.LayoutParams;
import android.widget.TableRow;

import androidx.appcompat.app.AppCompatActivity;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

public class SearchResultActivity extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "LocalSuppress"})
    @Override
    public void onCreate(Bundle savedInstanceState) {
        final Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_result);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageCarousel carousel = findViewById(R.id.carousel);

        carousel.registerLifecycle(getLifecycle());
        // Adding Tyler1 profile pictures
        List<CarouselItem> luddy = new ArrayList<>();
        luddy.add(
                new CarouselItem(
                        "https://pbs.twimg.com/profile_images/1588259399990054913/DNWUlfet_400x400.jpg"
                )
        );
        luddy.add(
                new CarouselItem(
                        "https://static.wikia.nocookie.net/ludwigahgren/images/2/2d/Ludwig7.jpg/revision/latest?cb=20210708033908"
                )
        );
        luddy.add(
                new CarouselItem(
                        "https://www.thefamouspeople.com/profiles/images/ludwig-ahgren-5.jpg"
                )
        );
        carousel.setData(luddy);

        ImageButton homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton searchButton = findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(context, SearchActivity.class);
                startActivity(intent);
            }
        });

        ImageButton profileButton = findViewById(R.id.profileButton);
        profileButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(context, ProfileActivity.class);
                startActivity(intent);
            }
        });

    }
}
