package com.example.kuisbesarmobileketiga;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class home extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView
                .setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.fr_home);
    }

    HomeFragment homeFragment = new HomeFragment();
    BookFragment bookFragment = new BookFragment();
    HistoryFragment historyFragment = new HistoryFragment();
    AccountFragment accountFragment = new AccountFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.fr_home) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, homeFragment)
                    .commit();
            return true;
        } else if (itemId == R.id.fr_book) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, bookFragment)
                    .commit();
            return true;
        } else if (itemId == R.id.fr_history) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, historyFragment)
                    .commit();
            return true;
        } else if (itemId == R.id.fr_account) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, accountFragment)
                    .commit();
            return true;
        } else {
            return false;
        }
    }

}