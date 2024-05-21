package com.example.tugasui11;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private TextView registerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Inisialisasi UI
        emailEditText = findViewById(R.id.etEmail);
        passwordEditText = findViewById(R.id.etPassword);
        loginButton = findViewById(R.id.btnLogin);
        registerTextView = findViewById(R.id.tvRegister);

        // Menangani klik tombol login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLoginClick(v);
            }
        });

        // Menangani klik link register
        registerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegisterClick(v);
            }
        });
    }

    public void onLoginClick(View view) {
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
            Toast.makeText(LoginActivity.this, "Email dan password tidak boleh kosong", Toast.LENGTH_SHORT).show();
            return;
        }

        // Logika autentikasi bisa ditambahkan di sini
        // Misalnya, memeriksa kecocokan email dan password dengan database pengguna
        // Untuk tujuan demonstrasi, kami hanya akan langsung ke HomeActivity
        goToHomeActivity();
    }

    public void onRegisterClick(View view) {
        // Arahkan ke RegisterActivity
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

    private void goToHomeActivity() {
        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(intent);
        finish(); // Tutup LoginActivity agar tidak bisa kembali lagi
    }
}
