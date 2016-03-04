package com.cs160.joleary.catnip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class CongressionalViewActivity extends Activity {
    private ImageButton picture1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congressional);
        Intent intent = getIntent();
        String value = intent.getStringExtra("button");

        picture1 = (ImageButton) findViewById(R.id.barbara);

        picture1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent myIntent = new Intent(CongressionalViewActivity.this, DetailedViewActivity.class);
            myIntent.putExtra("name", "barbara"); //Optional parameters
            CongressionalViewActivity.this.startActivity(myIntent);
            }
        });
    }

}
