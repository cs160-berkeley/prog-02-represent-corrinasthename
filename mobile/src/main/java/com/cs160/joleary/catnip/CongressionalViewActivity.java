package com.cs160.joleary.catnip;

import android.app.Activity;
<<<<<<< HEAD
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
=======
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170


public class CongressionalViewActivity extends Activity {
    private ImageButton picture1;
<<<<<<< HEAD
    private TextView title;
    private TextView name1, name2, name3, name4, name5, webmail1, webmail2, webmail3, webmail4, webmail5, t_handle1, t_handle2,t_handle3,t_handle4,t_handle5;
    private TextView [] names = new TextView[5];
    private TextView [] webmails = new TextView[5];
    private TextView [] twitters = new TextView[5];
    private String nameIntent;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    public static final String TAG = CongressionalViewActivity.class.getSimpleName();
=======
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congressional);
<<<<<<< HEAD
        DefaultHttpClient httpclient = new DefaultHttpClient(new BasicHttpParams());
        String getRequest = "";



        Intent intent = getIntent();
        String value = intent.getStringExtra("button");

        name1 = (TextView) findViewById(R.id.name1);
        name2 = (TextView) findViewById(R.id.name2);
        name3 = (TextView) findViewById(R.id.name3);
        name4 = (TextView) findViewById(R.id.name4);
        name5 = (TextView) findViewById(R.id.name5);
        names[0] = name1;
        names[1] = name2;
        names[2] = name3;
        names[3] = name4;
        names[4] = name5;

        webmail1 = (TextView) findViewById(R.id.webmail1);
        webmail2 = (TextView) findViewById(R.id.webmail2);
        webmail3 = (TextView) findViewById(R.id.webmail3);
        webmail4 = (TextView) findViewById(R.id.webmail4);
        webmail5 = (TextView) findViewById(R.id.webmail5);
        webmails[0] = webmail1;
        webmails[1] = webmail2;
        webmails[2] = webmail3;
        webmails[3] = webmail4;
        webmails[4] = webmail5;

        t_handle1 = (TextView) findViewById(R.id.t_handle1);
        t_handle2 = (TextView) findViewById(R.id.t_handle2);
        t_handle3 = (TextView) findViewById(R.id.t_handle3);
        t_handle4 = (TextView) findViewById(R.id.t_handle4);
        t_handle5 = (TextView) findViewById(R.id.t_handle5);
        twitters[0] = t_handle1;
        twitters[1] = t_handle2;
        twitters[2] = t_handle3;
        twitters[3] = t_handle4;
        twitters[4] = t_handle5;







        if (intent.getStringExtra("latitude") != null) {
            title = (TextView) findViewById(R.id.title);
            title.setText("For Current Location");
            getRequest = "https://congress.api.sunlightfoundation.com/legislators/locate?latitude="+intent.getStringExtra("latitude")+"&longitude="+intent.getStringExtra("longitude")+"&apikey=26d6bbbf8f224b088d7503879ee520ef";
            Log.i(TAG, "post created for current location");
        }

        if (intent.getStringExtra("zipcode") != null) {
            title = (TextView) findViewById(R.id.title);
            title.setText("For zipcode: " + intent.getStringExtra("zipcode"));
            getRequest = "https://congress.api.sunlightfoundation.com/legislators/locate?zip="+intent.getStringExtra("zipcode")+"&apikey=26d6bbbf8f224b088d7503879ee520ef";
            Log.i(TAG, "post created for zipcode");
        }

        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            new DownloadWebpageTask().execute(getRequest);
        } else {
            Log.i(TAG, "No network connection available.");
        }


        picture1 = (ImageButton) findViewById(R.id.pic1);
=======
        Intent intent = getIntent();
        String value = intent.getStringExtra("button");

        picture1 = (ImageButton) findViewById(R.id.barbara);
>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170

        picture1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                Intent myIntent = new Intent(CongressionalViewActivity.this, DetailedViewActivity.class);
                myIntent.putExtra("name", "barbara"); //Optional parameters
                CongressionalViewActivity.this.startActivity(myIntent);
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "CongressionalView Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.cs160.joleary.catnip/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "CongressionalView Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.cs160.joleary.catnip/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    // Uses AsyncTask to create a task away from the main UI thread. This task takes a
// URL string and uses it to create an HttpUrlConnection. Once the connection
// has been established, the AsyncTask downloads the contents of the webpage as
// an InputStream. Finally, the InputStream is converted into a string, which is
// displayed in the UI by the AsyncTask's onPostExecute method.
    private class DownloadWebpageTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... urls) {

            // params comes from the execute() call: params[0] is the url.
            try {
                return downloadUrl(urls[0]);
            } catch (IOException e) {
                return "Unable to retrieve web page. URL may be invalid.";
            }
        }
        // onPostExecute displays the results of the AsyncTask.
        @Override
        protected void onPostExecute(String result) {

            try{
                JSONObject jObject = new JSONObject(result);
                JSONArray jArray = jObject.getJSONArray("results");

                for (int i=0; i < jArray.length(); i++)
                {
                    try {
                        JSONObject oneObject = jArray.getJSONObject(i);
                        // Pulling items from the array
                        names[i].setText(oneObject.getString("title") + ". " + oneObject.getString("first_name") + " "+oneObject.getString("last_name"));
//                        String party = oneObject.getString("party");
                        webmails[i].setText(oneObject.getString("website") + "\n" + oneObject.getString("oc_email"));
                        twitters[i].setText(oneObject.getString("twitter_id"));

                        if (i > 2){
                            names[i].setVisibility(View.VISIBLE);
                            webmails[i].setVisibility(View.VISIBLE);
                            twitters[i].setVisibility(View.VISIBLE);

                        }

                    } catch (JSONException e) {
                        // Oops
                    }
                }
            }catch(JSONException e){
                //error
            }
        }

        // Given a URL, establishes an HttpUrlConnection and retrieves
        // the web page content as a InputStream, which it returns as
        // a string.
        private String downloadUrl(String myurl) throws IOException {
            try {
                URL url = new URL(myurl);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                Log.i(TAG, "began connection");
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                    StringBuilder stringBuilder = new StringBuilder();
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        stringBuilder.append(line).append("\n");
                        Log.i(TAG, "result : " + line);
                    }
                    bufferedReader.close();
                    return stringBuilder.toString();
                }
                finally{
                    urlConnection.disconnect();
                }
            }
            catch(Exception e) {
                Log.e("ERROR", e.getMessage(), e);
                return null;
            }
        }


    }
=======
            Intent myIntent = new Intent(CongressionalViewActivity.this, DetailedViewActivity.class);
            myIntent.putExtra("name", "barbara"); //Optional parameters
            CongressionalViewActivity.this.startActivity(myIntent);
            }
        });
    }

>>>>>>> 33447d91354024083ffc1597ff22b89a04b2e170
}
