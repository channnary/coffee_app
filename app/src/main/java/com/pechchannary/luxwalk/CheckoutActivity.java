package com.pechchannary.luxwalk;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;



public class CheckoutActivity extends AppCompatActivity {

    Dialog dialog;

    Button btnPayment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_check_out);



        Button dialogPaymentButton = findViewById(R.id.dialogPayment);
        dialogPaymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPaymentDialog();
            }
        });




    }


    private void showPaymentDialog() {
        // Inflate the custom layout/view
        LayoutInflater inflater = LayoutInflater.from(this);
        View customView = inflater.inflate(R.layout.activity_success_payment, null);

        // Build the dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(customView);

        // Create and show the dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
