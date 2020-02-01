package com.dharmarajupilli.webapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    private CircleImageView f, i, t, y, g,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f = findViewById(R.id.circleImageView_fb);
        i = findViewById(R.id.circleImageView_insta);
        t = findViewById(R.id.circleImageView_twitter);
        y = findViewById(R.id.circleImageView_youtube);
        g = findViewById(R.id.circleImageView_google);
        c=findViewById(R.id.circleImageView_cricbuzz);

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                i.putExtra("web", "google");
                startActivity(i);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                i.putExtra("web", "cricket");
                startActivity(i);
            }
        });


        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                i.putExtra("web", "facebook");
                startActivity(i);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                i.putExtra("web", "instagram");
                startActivity(i);
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                i.putExtra("web", "twitter");
                startActivity(i);
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                i.putExtra("web", "youtube");
                startActivity(i);
            }
        });


    }
}
