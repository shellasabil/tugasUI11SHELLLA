package com.example.tugasui11;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        int id = item.getItemId(); // Mendapatkan ID item yang dipilih

                        // Menggunakan pendekatan kondisional sederhana untuk menavigasi
                        if (id == R.id.navigation_home) {
                            // Handle click on Home icon
                        } else if (id == R.id.navigation_messages) {
                            // Navigate to MessagesActivity when Messages icon is clicked
                            startActivity(new Intent(HomeActivity.this, MessageActivity.class));
                        } else if (id == R.id.navigation_profile) {
                            // Handle click on Profile icon
                            startActivity(new Intent(HomeActivity.this, ProfilActivity.class));
                        }
                        return true;
                    }
                });
    }
}