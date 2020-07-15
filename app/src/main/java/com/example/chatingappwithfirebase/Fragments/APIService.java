package com.example.chatingappwithfirebase.Fragments;



import com.example.chatingappwithfirebase.Notifications.MyResponse;
import com.example.chatingappwithfirebase.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAbn1EFy0:APA91bH22mXsMoruUYnXoC2B_hl403xHt_roeURZ-XJzb6J-d0cCGrq5xIntCfFwXycl3M9nHK_BhZLg9MYcNurEGjL50vnvrmAVzzRu1JKma6anPcAguvcUXSsHzUOj8f4IH3dDU8TU"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
