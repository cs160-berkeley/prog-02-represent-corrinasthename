package com.cs160.joleary.catnip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {
    //there's not much interesting happening. when the buttons are pressed, they start
    //the PhoneToWatchService with the cat name passed in.

    private Button mFredButton;
    private Button mLexyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton mFredButton = (ImageButton) findViewById(R.id.zipCodeButton);
        ImageButton mLexyButton = (ImageButton) findViewById(R.id.cLButton);

        setTitle("Check On It");
        getActionBar().setIcon(R.drawable.checkogo);

        mFredButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent sendIntent = new Intent(getBaseContext(), PhoneToWatchService.class);
//                sendIntent.putExtra("CAT_NAME", "Fred");
//                startService(sendIntent);

                Intent myIntent = new Intent(MainActivity.this, CongressionalViewActivity.class);
                myIntent.putExtra("button", "zip_code"); //Optional parameters
                MainActivity.this.startActivity(myIntent);

                Intent watchIntent = new Intent(MainActivity.this, PhoneToWatchService.class);
                watchIntent.putExtra("button", "zip_code");
                startService(watchIntent);
            }
        });



        mLexyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, CongressionalViewActivity.class);
                myIntent.putExtra("button", "current_location"); //Optional parameters
                MainActivity.this.startActivity(myIntent);

                Intent watchIntent = new Intent(MainActivity.this, PhoneToWatchService.class);
                watchIntent.putExtra("button", "current_location");
                startService(watchIntent);
            }
        });

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {

            String catName = extras.getString("activity");
            if (catName.contains("detail")){
                Intent myIntent = new Intent(MainActivity.this, DetailedViewActivity.class);
                myIntent.putExtra("person", "barbara"); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
