package org.afpa.androidphpcrud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Start extends AppCompatActivity implements View.OnClickListener {
    private TextView inscriptionLink;
    private Button leButtonLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        inscriptionLink = (TextView) findViewById(R.id.inscription);
        leButtonLogin = (Button) findViewById(R.id.loginButton);
        inscriptionLink.setOnClickListener(this);
        leButtonLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == inscriptionLink) {
            startActivity(new Intent(this, InscriptionActivity.class));
            finish();
        }
        if (v == leButtonLogin) {
            startActivity(new Intent(this,LoginActivity.class));
        }

    }
}
