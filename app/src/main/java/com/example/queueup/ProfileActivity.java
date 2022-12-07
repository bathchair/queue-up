package com.example.queueup;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "LocalSuppress"})
    @Override
    public void onCreate(Bundle savedInstanceState) {
        final Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageCarousel carousel = findViewById(R.id.carousel);

        carousel.registerLifecycle(getLifecycle());
        // Adding Tyler1 profile pictures
        List<CarouselItem> tyler1 = new ArrayList<>();
        tyler1.add(
                new CarouselItem(
                        "https://zepto.scrolller.com/you-have-been-visited-by-perfectly-normal-tyler1-8k7xz7g1ub-540x607.jpg"
                )
        );
        tyler1.add(
                new CarouselItem(
                        "https://sportshub.cbsistatic.com/i/2021/04/09/48ea6da8-2013-46c0-b6d2-f69e5531e52b/league-of-legends-tyler1-1027428.jpg"
                )
        );
        tyler1.add(
                new CarouselItem(
                        "https://dotesports.com/wp-content/uploads/2021/09/Tyler1-Draven.jpg"
                )
        );
        carousel.setData(tyler1);

        ImageButton homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
