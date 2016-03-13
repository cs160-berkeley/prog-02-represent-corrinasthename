package com.cs160.joleary.catnip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
<<<<<<< HEAD
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import io.fabric.sdk.android.Fabric;
=======
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170


public class MainActivity extends Activity {

<<<<<<< HEAD
    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "2K3rHErNu6kLGPQeN8vATkZiZ";
    private static final String TWITTER_SECRET = "8oRZ8GFsNLT75AdtsVg5M9Xqbh5O4g5bufv42NElGPeCOfiHyD";


=======
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170
    private TextView mTextView, name, party, testing;
    private Button mFeedBtn, clButton;
    private ImageView picture, party_pic, white;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
=======
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170
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
