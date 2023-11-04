package com.example.gpsmapachile;

import androidx.annotation.NonNull;

import com.google.android.gms.maps.model.LatLng;

public interface MainActivity {
    void onMapLongClick(@NonNull LatLng latLng);
}
