package com.samichankesor.coffeeApp;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FavouriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_favorite);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        NavbarActivity navbarActivity = new NavbarActivity(this);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                return navbarActivity.handleNavigation(item.getItemId());
            }
        });

        GoBackButtonUtil.setupGoBackButton(this, R.id.goBack);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


//        ImageView backButton = findViewById(R.id.backButton);
//
//        backButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Call finish() to close the current activity and go back
//                finish();
//                System.out.println("hellowork");
//            }
//        });
    }

}
