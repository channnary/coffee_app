package com.samichankesor.coffeeApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ShowDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view_detail);
//        GoBackButtonUtil.setupGoBackButton(this, R.id.goBack);
    }

    public void showCart(View view) {
        Intent intent = new Intent(this, ShowCartActivity.class);
        startActivity(intent);
    }

}
