package com.cs160.joleary.catnip;

<<<<<<< HEAD
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
=======
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170

public class DetailedViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_view);
<<<<<<< HEAD

        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/Roboto-Regular.ttf");
        Intent intent = getIntent();
        String value = intent.getStringExtra("name");



        String getRequest = "";



=======
        Intent intent = getIntent();
        String value = intent.getStringExtra("name");
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170
    }

}
