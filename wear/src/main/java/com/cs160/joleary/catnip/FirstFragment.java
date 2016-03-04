package com.cs160.joleary.catnip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by corrinasthename on 3/1/16.
 */

public class FirstFragment extends Fragment implements View.OnClickListener {
    private ImageButton pic_button;
    private TextView text1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.first_frag, container, false);
        pic_button = (ImageButton) v.findViewById(R.id.click_me);
        pic_button.setOnClickListener(this);
        text1 = (TextView) v.findViewById(R.id.rep_name);
        return v;
    }




    @Override
    public void onClick(View v) {
        //do what you want to do when button is clicked
//        text1.setText("what whyyyyyy");
        Intent sendIntent = new Intent(getActivity(), WatchToPhoneService.class);
        sendIntent.putExtra("activity", "detail"); //Optional parameters
        getActivity().startService(sendIntent);

    }




    public static FirstFragment newInstance(String text) {

        FirstFragment f = new FirstFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
}