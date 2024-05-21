package com.example.tugasui11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        // Initialize Views
        ImageView profileImage = findViewById(R.id.profileImage);
        Button btnPersonalInfo = findViewById(R.id.btnPersonalInfo);
        Button btnLoginSecurity = findViewById(R.id.btnLoginSecurity);
        Button btnPaymentBilling = findViewById(R.id.btnPaymentBilling);

        // Set OnClickListener for Personal Information Button
        btnPersonalInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Personal Information Button click
            }
        });

        // Set OnClickListener for Login and Security Button
        btnLoginSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Login and Security Button click
            }
        });

        // Set OnClickListener for Payment and Billing Button
        btnPaymentBilling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Payment and Billing Button click
            }
        });
    }
}