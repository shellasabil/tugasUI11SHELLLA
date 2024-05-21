package com.example.tugasui11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Mendapatkan referensi tombol register
        Button registerButton = findViewById(R.id.btnRegister);

        // Menambahkan listener onClick untuk tombol register
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Di sini Anda akan menulis logika untuk melakukan proses registrasi

                // Misalnya, setelah proses registrasi selesai dan berhasil, Anda akan mengarahkan pengguna kembali ke LoginActivity
                navigateToLogin();
            }
        });
    }

    // Metode untuk mengarahkan pengguna kembali ke LoginActivity setelah registrasi berhasil
    private void navigateToLogin() {
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(intent);
        finish(); // Tutup RegisterActivity agar tidak bisa kembali lagi
    }
}