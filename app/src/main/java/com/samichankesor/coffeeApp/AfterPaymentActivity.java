package com.samichankesor.coffeeApp;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AfterPaymentActivity extends AppCompatActivity {

    public void afterPayment(View view) {
        Intent intent = new Intent(this, CheckoutActivity.class);
        startActivity(intent);
    }

}