package com.example.smart_life;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: r8-map-id-3bb661786d9cf04bdd4db94c51e681f9f2d4a8de231340567142ca45c28020b0 */
/* loaded from: classes.dex */
public final class TaskReminderReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        String stringExtra = intent.getStringExtra("id");
        if (stringExtra == null) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("title");
        if (stringExtra2 == null) {
            stringExtra2 = "Smart Life reminder";
        }
        context.getSharedPreferences("smart_life_task_reminders", 0).edit().remove(stringExtra).apply();
        if (Build.VERSION.SDK_INT < 33 || context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            Object systemService = context.getSystemService("notification");
            systemService.getClass();
            NotificationManager notificationManager = (NotificationManager) systemService;
            notificationManager.createNotificationChannel(new NotificationChannel("smart_life_reminders", "Smart Life reminders", 4));
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            PendingIntent activity = launchIntentForPackage != null ? PendingIntent.getActivity(context, stringExtra.hashCode(), launchIntentForPackage, 201326592) : null;
            Notification.Builder builder = new Notification.Builder(context, "smart_life_reminders");
            builder.setSmallIcon(R.drawable.ic_popup_reminder).setContentTitle("Smart Life").setContentText(stringExtra2).setStyle(new Notification.BigTextStyle().bigText(stringExtra2)).setAutoCancel(true).setContentIntent(activity);
            notificationManager.notify(stringExtra.hashCode(), builder.build());
        }
    }
}
