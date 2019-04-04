package com.njoroge.jamie.swiftaidvictim.Common;

import com.njoroge.jamie.swiftaidvictim.Remote.FCMClient;
import com.njoroge.jamie.swiftaidvictim.Remote.IFCMService;

public class Common {
    public static final String driver_tbl = "Drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String user_victim_tbl = "VictimsInformation";
    public static final String request_pickup_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";

    public static final String fcmURL = "https://fcm.googleapis.com/";

    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
