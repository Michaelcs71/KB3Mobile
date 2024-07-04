package com.example.kuisbesarmobileketiga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class halaman_login extends AppCompatActivity {

    DatabaseKB3 db;
    EditText username, password;
    Button loginButton, registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_halaman_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

            db = new DatabaseKB3(this);
            username = findViewById(R.id.username);
            password = findViewById(R.id.password);
            loginButton = findViewById(R.id.loginButton);
            registerButton = findViewById(R.id.registerButton);

            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String Username = username.getText().toString();
                    String Password = password.getText().toString();

                    if (db.checkUser(Username, Password)) {
                        Toast.makeText(halaman_login.this, "Login successful, " + username + "!", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(halaman_login.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            registerButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(halaman_login.this, halaman_register.class));
                }
            });
        }
    private void openHomeFragment() {
        // Create a new instance of the home fragment
        Fragment homeFragment = new HomeFragment();

        // Replace the current fragment with the home fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.login, homeFragment);
        transaction.addToBackStack(null); // Optional: add to back stack to allow back navigation
        transaction.commit();
    }
}

