package com.example.cpsc525.applocker;

/**
 * Created by ahmedzaidi73 on 2016-11-07.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class LockscreenIntentReceiver extends BroadcastReceiver {

    // Handle actions and display Lockscreen
    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)
                || intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)
                || intent.getAction().equals(Intent.ACTION_SCREEN_ON)
                || intent.getAction().equals(Intent.ACTION_SHUTDOWN)
                || intent.getAction().equals(Intent.ACTION_POWER_CONNECTED)
                || intent.getAction().equals(Intent.ACTION_POWER_DISCONNECTED)
                ) {
            Intent i = new Intent(context, MainActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }

    }

    // Display lock screen
    /*private void start_lockscreen(Context context) {
        Intent mIntent = new Intent(context, MainActivity.class);
        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(mIntent);
    }*/

}
