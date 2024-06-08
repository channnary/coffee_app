package com.pechchannary.luxwalk;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class AfterPaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_home);


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button afterPaymentButton = findViewById(R.id.afterPayment);
        afterPaymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start the ShoppingActivity
                Intent intent = new Intent(AfterPaymentActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

    }


    public void AfterPayment(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

}