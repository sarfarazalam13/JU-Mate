package com.example.jumate;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.jumate.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    Button lt,lab,lt1,lab1,lab2;
    TextView text;
    Polygon poly;
    HorizontalScrollView horizontalScrollView;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        horizontalScrollView=(HorizontalScrollView)findViewById(R.id.ltbutton);
        horizontalScrollView.setVisibility(View.GONE);
        horizontalScrollView=(HorizontalScrollView)findViewById(R.id.labbutton);
        horizontalScrollView.setVisibility(View.GONE);
        text=findViewById(R.id.locatdes);
        text.setText("JU Mate");
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);



        //Lts//////////////////////////////////////////////////////////////////
        lt=(Button)findViewById(R.id.lts);
        lt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                horizontalScrollView=(HorizontalScrollView)findViewById(R.id.mainmenu);
                horizontalScrollView.setVisibility(View.GONE);
                horizontalScrollView=(HorizontalScrollView)findViewById(R.id.ltbutton);
                horizontalScrollView.setVisibility(View.VISIBLE);

            }
        });


        //LT 1///////////////////////////////////////////////////////////////
        lt1=(Button)findViewById(R.id.lt1);
        lt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("GF eng block");


                mMap.animateCamera(CameraUpdateFactory.zoomTo(3.0f));
                LatLng JU = new LatLng(26.7755530, 75.8776532);

                CameraUpdate cameraUpdate=CameraUpdateFactory.newLatLngZoom(JU,24);
                mMap.addMarker(new MarkerOptions().position(JU).title("Science Block Centre"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(JU));
                mMap.animateCamera(cameraUpdate,1500,new GoogleMap.CancelableCallback()
                {
                    @Override
                    public void onCancel() {

                    }

                    @Override
                    public void onFinish() {

                    }

                });

            }
        });


        //Labs//////////////////////////////////////////////////////
        lab=(Button)findViewById(R.id.lab);
        lab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                horizontalScrollView=(HorizontalScrollView)findViewById(R.id.mainmenu);
                horizontalScrollView.setVisibility(View.GONE);
                horizontalScrollView=(HorizontalScrollView)findViewById(R.id.labbutton);
                horizontalScrollView.setVisibility(View.VISIBLE);

            }
        });


        lab1=(Button)findViewById(R.id.lab1);
        lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.animateCamera(CameraUpdateFactory.zoomTo(3.0f));
                LatLng JU = new LatLng(26.7755530, 75.8776532);

                CameraUpdate cameraUpdate=CameraUpdateFactory.newLatLngZoom(JU,24);
                mMap.addMarker(new MarkerOptions().position(JU).title("Science Block Centre"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(JU));
                mMap.animateCamera(cameraUpdate,1500,new GoogleMap.CancelableCallback()
                {
                    @Override
                    public void onCancel() {

                    }

                    @Override
                    public void onFinish() {

                    }

                });

            }
        });
        lab2=(Button)findViewById(R.id.lab2);
        lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                LatLng JU = new LatLng(26.7758883, 75.8758176);

                CameraUpdate cameraUpdate=CameraUpdateFactory.zoomTo(24);
                mMap.addMarker(new MarkerOptions().position(JU).title("Science Block Centre"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(JU));
                mMap.animateCamera(cameraUpdate,1500,new GoogleMap.CancelableCallback()
                {
                    @Override
                    public void onCancel() {

                    }

                    @Override
                    public void onFinish() {

                    }

                });

            }


        });





    }




    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     *
     */



    @Override


    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setLatLngBoundsForCameraTarget(new LatLngBounds(
                new LatLng(26.770639, 75.870437), // Southwest bound
                new LatLng(26.778405, 75.884486) // Northeast bound
        ));
        mMap.setMinZoomPreference(15.0f);
        mMap.setMaxZoomPreference(30.0f);
        mMap.animateCamera(CameraUpdateFactory.zoomTo(3.0f));
        LatLng JU = new LatLng(26.77634815034388, 75.87748599748012);


        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(JU, 19);
        mMap.addMarker(new MarkerOptions().position(JU).title("JU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(JU));
        mMap.animateCamera(cameraUpdate, 1500, new GoogleMap.CancelableCallback() {
            @Override
            public void onCancel() {

            }

            @Override
            public void onFinish() {

            }

        });

        //circle

        LatLng Sciencecentre = new LatLng(26.7755530, 75.8776532);
        mMap.addCircle(new CircleOptions().center(Sciencecentre).radius(5).fillColor(Color.GREEN).strokeColor(Color.GRAY));
        //Lt 14,9 square
        mMap.addPolygon(new PolygonOptions().add(new LatLng(26.7756901, 75.8774577),
                new LatLng(26.7756994, 75.8775727),
                new LatLng(26.7756228, 75.8775805),
                new LatLng(26.7756135, 75.8774658),
                new LatLng(26.7756901, 75.8774577)).fillColor(Color.RED).strokeColor(Color.GRAY));



        //LT 4,6,19,23
        mMap.addPolygon(new PolygonOptions().add(new LatLng(26.7756901, 75.8774577),
                new LatLng(26.7756994, 75.8775727),
                new LatLng(26.7756228, 75.8775805),
                new LatLng(26.7756135, 75.8774658),
                new LatLng(26.7756901, 75.8774577)).fillColor(Color.RED).strokeColor(Color.GRAY).clickable(true));



        mMap.addPolygon(new PolygonOptions().add(new LatLng(26.7758883, 75.8758176),
                new LatLng(26.7758988, 75.8759436),
                new LatLng(26.7758167, 75.8759520),
                new LatLng(26.7758054, 75.8758290),
                new LatLng(26.7758883, 75.8758176)).fillColor(Color.RED).strokeColor(Color.GRAY));

    }
}

//26.775531544164103, 75.87763236804159 science block