package com.cs160.joleary.catnip;

import android.app.Activity;
import android.content.Intent;
<<<<<<< HEAD
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
=======
import android.os.Bundle;
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;

public class MainActivity extends Activity implements
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener {
=======
import android.widget.ImageButton;

public class MainActivity extends Activity {
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170
    //there's not much interesting happening. when the buttons are pressed, they start
    //the PhoneToWatchService with the cat name passed in.

    private Button mFredButton;
    private Button mLexyButton;
<<<<<<< HEAD
    private EditText zip;
    private GoogleApiClient mGoogleApiClient;
    public static final String TAG = MainActivity.class.getSimpleName();
    // The minimum distance to change Updates in meters
    private static final float MIN_DISTANCE_CHANGE_FOR_UPDATES = 10; // 10 meters
    // The minimum time between updates in milliseconds
    private static final long MIN_TIME_BW_UPDATES = 1000 * 60 * 1; // 1 minute
=======
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/Roboto-Regular.ttf");

=======
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170
        ImageButton mFredButton = (ImageButton) findViewById(R.id.zipCodeButton);
        ImageButton mLexyButton = (ImageButton) findViewById(R.id.cLButton);

        setTitle("Check On It");
        getActionBar().setIcon(R.drawable.checkogo);

<<<<<<< HEAD
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();

=======
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170
        mFredButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent sendIntent = new Intent(getBaseContext(), PhoneToWatchService.class);
//                sendIntent.putExtra("CAT_NAME", "Fred");
//                startService(sendIntent);
<<<<<<< HEAD
                TextView inputZip = (TextView) findViewById(R.id.zipCode);
                int zipcode = Integer.parseInt(inputZip.getText().toString());

                Intent myIntent = new Intent(MainActivity.this, CongressionalViewActivity.class);
                myIntent.putExtra("button", "zip_code"); //Optional parameters
                myIntent.putExtra("zipcode", ""+zipcode);
=======

                Intent myIntent = new Intent(MainActivity.this, CongressionalViewActivity.class);
                myIntent.putExtra("button", "zip_code"); //Optional parameters
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170
                MainActivity.this.startActivity(myIntent);

                Intent watchIntent = new Intent(MainActivity.this, PhoneToWatchService.class);
                watchIntent.putExtra("button", "zip_code");
                startService(watchIntent);
            }
        });



        mLexyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                onStart();
                mGoogleApiClient.connect();
                if (mGoogleApiClient.isConnected()){
                    Log.i(TAG, "Location services connected.");
                    try {
                        Location location = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
                        handleNewLocation(location);
                        Intent myIntent = new Intent(MainActivity.this, CongressionalViewActivity.class);
                        myIntent.putExtra("button", "current_location"); //Optional parameters
                        myIntent.putExtra("latitude", location.getLatitude()+"");
                        myIntent.putExtra("longitude", location.getLongitude()+"");
                        MainActivity.this.startActivity(myIntent);

                        Intent watchIntent = new Intent(MainActivity.this, PhoneToWatchService.class);
                        watchIntent.putExtra("button", "current_location");
                        startService(watchIntent);
                    } catch (SecurityException e){
                        Log.i(TAG, "You do not have persmission to location services.");
                    }

                }




=======
                Intent myIntent = new Intent(MainActivity.this, CongressionalViewActivity.class);
                myIntent.putExtra("button", "current_location"); //Optional parameters
                MainActivity.this.startActivity(myIntent);

                Intent watchIntent = new Intent(MainActivity.this, PhoneToWatchService.class);
                watchIntent.putExtra("button", "current_location");
                startService(watchIntent);
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170
            }
        });

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
<<<<<<< HEAD
            String catName = extras.getString("activity");
            if (catName != null && catName.contains("detail")){
=======

            String catName = extras.getString("activity");
            if (catName.contains("detail")){
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170
                Intent myIntent = new Intent(MainActivity.this, DetailedViewActivity.class);
                myIntent.putExtra("person", "barbara"); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        }

    }


<<<<<<< HEAD


=======
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170
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
<<<<<<< HEAD

    @Override
    public void onConnected(Bundle connectionHint) {
        try{
            Location location = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
            Log.i(TAG, "Got location.");
            handleNewLocation(location);
        }catch (SecurityException e) {
            Log.i(TAG, "You do not have persmission to location services.");
        }
        Log.i(TAG, "Location services connected.");
    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {

    }

    @Override
    public void onConnectionSuspended(int i) {
        Log.i(TAG, "Location services suspended. Please reconnect.");
    }

//    protected void onStart() {
//        super.onStart();
//        mGoogleApiClient.connect();
//    }

    protected void onStop() {
        super.onStop();
        if (mGoogleApiClient.isConnected()) {
            mGoogleApiClient.disconnect();
        }
    }

    private void handleNewLocation(Location location) {
//        Log.d(TAG, "found location " + location.toString());
//        Log.i(TAG, "found location ");
        Log.i(TAG, "found location " + location.getLatitude() + " and " + location.getLongitude());
    }




=======
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170
}
