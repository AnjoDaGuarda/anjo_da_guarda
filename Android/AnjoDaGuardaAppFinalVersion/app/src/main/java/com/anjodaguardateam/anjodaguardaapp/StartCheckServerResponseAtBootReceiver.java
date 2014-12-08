package com.anjodaguardateam.anjodaguardaapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by RF411 on 07/12/2014.
 */
public class StartCheckServerResponseAtBootReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent)
    {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction()))
        {
            Intent serviceIntent = new Intent(context, CheckServerResponse.class);
            context.startService(serviceIntent);
        }
    }
}
