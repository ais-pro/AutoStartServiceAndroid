package com.example.root.autostart;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by root on 2/16/16.
 */

public class bootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"I am boot start service",Toast.LENGTH_SHORT).show();
        if(Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())){
            Intent i=new Intent(context,MyService.class);
            context.startService(i);
        }
    }
}
