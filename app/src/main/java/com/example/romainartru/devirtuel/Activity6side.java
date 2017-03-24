package com.example.romainartru.devirtuel;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by romainartru on 24/03/2017.
 */
import java.security.SecureRandom;

public class Activity6side extends Activity {
    private TextView res;
    private int m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dice6sided);

        m = getIntent().getIntExtra("max", 0);
        Button b = (Button) findViewById(R.id.buttonLaunch);
        TextView textTitle = (TextView) findViewById(R.id.titlePage);
        textTitle.setText(String.format("%d sided dice", m));

        res = ((TextView) findViewById(R.id.result));
        res.setText("");

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecureRandom random = new SecureRandom();
                int result = random.nextInt(m) + 1;
                res.setText(""+ result);
            }
        });
    }
}
