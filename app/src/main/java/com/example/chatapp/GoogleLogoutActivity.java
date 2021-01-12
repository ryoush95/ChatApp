package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class GoogleLogoutActivity extends AppCompatActivity implements View.OnClickListener {
    Button Logout,Revote;
    private FirebaseAuth mAuth ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_logout);

        Logout = (Button)findViewById(R.id.btn_logout);
        Revote = (Button)findViewById(R.id.btn_revote);

        mAuth = FirebaseAuth.getInstance();

        Logout.setOnClickListener(this);
        Revote.setOnClickListener(this);
    }

    private void Logout() {
        FirebaseAuth.getInstance().signOut();
    }

    private void Revote() {
        mAuth.getCurrentUser().delete();
    }

    @Override
    public void onClick(View view) {

    }
}