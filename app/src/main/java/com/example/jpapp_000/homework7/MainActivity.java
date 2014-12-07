package com.example.jpapp_000.homework7;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends Activity {
    private GoogleMap gmap;

    static final LatLng Louisville = new LatLng(38.250, 85.766);
    static final LatLng Cincy = new LatLng(39.100, 84.516);
    static final LatLng Indy = new LatLng(39.791,86.148);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        /*if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }*/

        gmap = ((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();

        Marker louisville= gmap.addMarker(new MarkerOptions()
        .position(Louisville)
        .title("Louisville,KY")
        .draggable(true));

        Marker cincy = gmap.addMarker(new MarkerOptions()
        .position(Louisville)
        .title("Cincinatti,Ohio")
        .draggable(true));

        Marker indy = gmap.addMarker(new MarkerOptions()
        .position(Indy)
        .title("Indianapolis, Indiana")
        .draggable(true));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
}
