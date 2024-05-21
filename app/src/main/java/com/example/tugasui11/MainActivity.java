package com.example.tugasui11;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this, LoginActivity.class));

        // Cek apakah pengguna sudah login atau belum
        boolean userLoggedIn = checkUserLoggedIn(); // Implementasi metode ini tergantung pada aplikasi Anda

        if (userLoggedIn) {
            // Jika pengguna sudah login, arahkan ke HomeActivity
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
            finish(); // Tutup MainActivity agar tidak bisa kembali lagi
        } else {
            // Jika pengguna belum login, arahkan ke LoginActivity
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
            finish(); // Tutup MainActivity agar tidak bisa kembali lagi
        }
    }

    // Metode untuk memeriksa apakah pengguna sudah login atau belum
    private boolean checkUserLoggedIn() {
        // Implementasi ini tergantung pada aplikasi Anda
        // Misalnya, Anda bisa menyimpan status login pengguna di SharedPreferences atau database
        // Kemudian, periksa statusnya di sini dan kembalikan true jika pengguna sudah login
        return false; // Misalnya, kita kembalikan false untuk simulasi
    }
}
