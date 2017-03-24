package com.example.romainartru.devirtuel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button6 = (Button) findViewById(R.id.button6side);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity6side.class);
                intent.putExtra("max", 6);
                startActivity(intent);
            }
        });

        Button button20 = (Button) findViewById(R.id.button20side);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Activity6side.class);
                intent2.putExtra("max", 20);
                startActivity(intent2);
            }
        });
    }
}
