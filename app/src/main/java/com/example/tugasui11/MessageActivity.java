package com.example.tugasui11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MessageActivity extends AppCompatActivity {

    private TextView tvNoMessages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        // Initialize TextView
        tvNoMessages = findViewById(R.id.tvNoMessages);

        // Set visibility of TextView based on message availability
        // For example, if user has no messages, make the TextView visible
        // Otherwise, make it invisible
        if (userHasNoMessages()) {
            tvNoMessages.setVisibility(View.VISIBLE);
        } else {
            tvNoMessages.setVisibility(View.GONE);
        }

        // Initialize Buttons
        Button btnTravel = findViewById(R.id.btnTravel);
        Button btnSupport = findViewById(R.id.btnSupport);
        Button btnParallel = findViewById(R.id.btnParallel);

        // Set onClickListeners for Buttons if needed
        // Example:
        btnTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click event for 'Berpergian'
            }
        });

        btnSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click event for 'Dukungan'
            }
        });

        btnParallel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click event for 'Secara Sejajar'
            }
        });
    }

    // Example method to check if user has messages
    private boolean userHasNoMessages() {
        // Implement logic to check if user has messages
        // For example, you might check a database or an API
        // Return true if user has no messages, otherwise return false
        return true; // Change this based on your actual logic
    }
}