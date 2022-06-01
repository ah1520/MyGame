package com.dam.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button btnPlusouMoins, btnMorpion;

    private void initiUI(){
        btnPlusouMoins = findViewById(R.id.btnPlusouMoins);
        btnMorpion = findViewById(R.id.btnMorpion);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initiUI();

        btnPlusouMoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this,
                        PlusOuMoins.class);
                String titre = btnPlusouMoins.getText().toString();
                intent.putExtra("TitrePage", titre);  //(Key, Value)

                startActivity(intent);
            }
        });
    }
}