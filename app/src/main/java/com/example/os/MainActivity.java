package com.example.os;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }
    public void onClick(View view){

        switch (view.getId()){

            case R.id.imageView3 :
                startActivity(new Intent(this, SActivity.class));
                break;
            case R.id.imageView6 :
                break;
            case R.id.imageView5 :
                startActivity(new Intent(this, SbActivity.class));
                break;

        }
    }
}
