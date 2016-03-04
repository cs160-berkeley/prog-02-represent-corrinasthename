package com.cs160.joleary.catnip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

public class SwipeActivity extends FragmentActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);

        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

        Intent intent = getIntent();
        String value = intent.getStringExtra("button");


//        /* do this in onCreate */
//        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
//        mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
//        mAccel = 0.00f;
//        mAccelCurrent = SensorManager.GRAVITY_EARTH;
//        mAccelLast = SensorManager.GRAVITY_EARTH;
//
//        if (mAccel > 1) {
//            Toast toast = Toast.makeText(getApplicationContext(), "Device has shaken.", Toast.LENGTH_LONG);
//            toast.show();
//            Intent myIntent = new Intent(CongressionalViewActivity.this, DetailedViewActivity.class);
//            myIntent.putExtra("name", "barbara"); //Optional parameters
//            CongressionalViewActivity.this.startActivity(myIntent);
//        }
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch (pos) {

                case 0:
                    return FirstFragment.newInstance("FirstFragment, Instance 1");
                case 1:
                    return SecondFragment.newInstance("SecondFragment, Instance 1");
                case 2:
                    return ThirdFragment.newInstance("ThirdFragment, Instance 1");
//                case 4: return ThirdFragment.newInstance("ThirdFragment, Instance 3");
                default:
                    return FourthFragment.newInstance("FourthFragment, Default");
            }
        }

        @Override
        public int getCount() {
            return 5;
        }
    }


    /* put this into your activity class */
//    private SensorManager mSensorManager;
//    private float mAccel; // acceleration apart from gravity
//    private float mAccelCurrent; // current acceleration including gravity
//    private float mAccelLast; // last acceleration including gravity
//
//    private final SensorEventListener mSensorListener = new SensorEventListener() {
//
//        public void onSensorChanged(SensorEvent se) {
//            float x = se.values[0];
//            float y = se.values[1];
//            float z = se.values[2];
//            mAccelLast = mAccelCurrent;
//            mAccelCurrent = (float) Math.sqrt((double) (x * x + y * y + z * z));
//            float delta = mAccelCurrent - mAccelLast;
//            mAccel = mAccel * 0.9f + delta; // perform low-cut filter
//        }
//
//        public void onAccuracyChanged(Sensor sensor, int accuracy) {
//        }
//    };

//    @Override
//    protected void onResume() {
//        super.onResume();
//        mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
//    }
//
//    @Override
//    protected void onPause() {
//        mSensorManager.unregisterListener(mSensorListener);
//        super.onPause();
//    }

}