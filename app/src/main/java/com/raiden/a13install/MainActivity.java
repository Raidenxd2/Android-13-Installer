package com.raiden.a13install;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mewhen = (Button) findViewById(R.id.mewhen);
        mewhen.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(),"bro ur phon has ben bricked 💀💀💀",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(this, DestroyedSystem.class);
            startActivity(myIntent);
        });
    }
}