package com.pechchannary.luxwalk;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        NavbarActivity navbarActivity = new NavbarActivity(this);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                return navbarActivity.handleNavigation(item.getItemId());
            }
        });





    }

    public void showDetail(View view) {
        Intent intent = new Intent(this, ShowDetailActivity.class);
        startActivity(intent);
    }

    public void showCart(View view) {
        Intent intent = new Intent(this, ShowCartActivity.class);
        startActivity(intent);
    }




}
