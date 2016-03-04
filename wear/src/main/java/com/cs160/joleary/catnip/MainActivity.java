package com.cs160.joleary.catnip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView mTextView, name, party, testing;
    private Button mFeedBtn, clButton;
    private ImageView picture, party_pic, white;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        name = (TextView) findViewById(R.id.rep_name);
        party = (TextView) findViewById(R.id.party);



        if (extras != null) {
            
            String type = extras.getString("button");
            if (type.contains("zip_code")){

                Intent myIntent = new Intent(MainActivity.this, SwipeActivity.class);
                myIntent.putExtra("button", "zip_code"); //Optional parameters
                MainActivity.this.startActivity(myIntent);


            }
        }
    }


}
