package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Pawan Khandal on 10/23/18,17
 */
public class MyFirebaseInstanceIdService extends FirebaseMessagingService {
    private final static String TAG = MyFirebaseInstanceIdService.class.getSimpleName();
    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.e(TAG, "onNewToken: "+s );
    }
    
   
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
    }
}
