package com.example.jumate;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.jumate.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    Button food;
    Button stationary;
    Button grocery;
    Button medical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        food=(Button)findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfood();
            }
        });


        stationary=(Button)findViewById(R.id.stationary);
        stationary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openstationary();
            }
        });

        grocery=(Button)findViewById(R.id.grocery);
        grocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengrocery();
            }
        });

        medical=(Button)findViewById(R.id.medical);
        medical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmedical();
            }
        });

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    private void openmedical() {

        mMap.animateCamera(CameraUpdateFactory.zoomTo(3.0f));
        LatLng JU = new LatLng(26.26077557134943, 73.93602207282825);

        CameraUpdate cameraUpdate=CameraUpdateFactory.newLatLngZoom(JU,10);
        mMap.addMarker(new MarkerOptions().position(JU).title("JU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(JU));
        mMap.animateCamera(cameraUpdate,3,new GoogleMap.CancelableCallback()
        {
            @Override
            public void onCancel() {

            }

            @Override
            public void onFinish() {

            }

        });
    }

    private void opengrocery() {
        LatLng JU = new LatLng(26.26077557134943, 73.93602207282825);
        mMap.addMarker(new MarkerOptions().position(JU).title("JU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(JU));
    }

    private void openstationary() {
        LatLng JU = new LatLng(26.26077557134943, 73.93602207282825);
        mMap.addMarker(new MarkerOptions().position(JU).title("JU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(JU));
    }

    private void openfood() {
        LatLng JU = new LatLng(26.26077557134943, 73.93602207282825);
        mMap.addMarker(new MarkerOptions().position(JU).title("JU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(JU));
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.animateCamera(CameraUpdateFactory.zoomTo(3.0f));
        LatLng JU = new LatLng(26.77634815034388, 75.87748599748012);

        CameraUpdate cameraUpdate=CameraUpdateFactory.newLatLngZoom(JU,19);
        mMap.addMarker(new MarkerOptions().position(JU).title("JU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(JU));
        mMap.animateCamera(cameraUpdate,3,new GoogleMap.CancelableCallback()
        {
            @Override
            public void onCancel() {

            }

            @Override
            public void onFinish() {

            }

        });
    }
}

//26.775531544164103, 75.87763236804159 science block