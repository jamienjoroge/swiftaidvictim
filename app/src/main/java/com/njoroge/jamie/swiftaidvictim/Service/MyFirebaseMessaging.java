package com.njoroge.jamie.swiftaidvictim.Service;


import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.Gson;

public class MyFirebaseMessaging extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        LatLng customerLocation = new Gson().fromJson(remoteMessage.getData().put("","message"),LatLng.class);
         double lat = customerLocation.latitude;
        double lng=customerLocation.longitude;

    }

}
