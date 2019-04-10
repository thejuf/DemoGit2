package com.caotic.juf.demogit;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private TextView tv_u,tv_c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tv_c = findViewById(R.id.tv_c);
        tv_u = findViewById(R.id.tv_u);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv_u.getText().equals("")|tv_c.getText().equals("")){
                    Toast.makeText(MainActivity.this, "Campos vacios", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv_c.setTextColor(Color.BLUE);
        tv_u.setAllCaps(true);
        tv_c.setTextSize(0.8f);
    }
}
