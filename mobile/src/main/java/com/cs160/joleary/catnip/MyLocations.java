package com.cs160.joleary.catnip;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by corrinasthename on 3/10/16.
 */
public class MyLocations {
    private final List<LatLng> locations = new ArrayList<LatLng>();

    public void addLocation(LatLng latLng) {
        locations.add(latLng);
    }
    //other methods
}