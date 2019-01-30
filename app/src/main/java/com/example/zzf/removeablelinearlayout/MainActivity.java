package com.example.zzf.removeablelinearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RemoveableLinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (RemoveableLinearLayout) findViewById(R.id.custom_view_layout);
        layout.setOnClickListener(new RemoveableLinearLayout.onClickListener() {
            @Override
            public void onClick() {
                Toast.makeText(MainActivity.this, "You clicked the View", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
