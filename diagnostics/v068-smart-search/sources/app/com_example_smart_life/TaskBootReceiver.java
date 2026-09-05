package com.example.smart_life;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.Map;
import org.json.JSONObject;
import p000.wo0;
import p000.yi3;

/* compiled from: r8-map-id-3bb661786d9cf04bdd4db94c51e681f9f2d4a8de231340567142ca45c28020b0 */
/* loaded from: classes.dex */
public final class TaskBootReceiver extends BroadcastReceiver {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Context context2;
        context.getClass();
        intent.getClass();
        if (wo0.m4989a(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("smart_life_task_reminders", 0);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map<String, ?> all = sharedPreferences.getAll();
            all.getClass();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String str = value instanceof String ? (String) value : null;
                if (str != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        String strOptString = jSONObject.optString("id", key);
                        String strOptString2 = jSONObject.optString("title", "Smart Life reminder");
                        long jOptLong = jSONObject.optLong("whenMs", 0L);
                        if (jOptLong > jCurrentTimeMillis) {
                            strOptString.getClass();
                            strOptString2.getClass();
                            context2 = context;
                            try {
                                yi3.m5241a(context2, strOptString, strOptString2, jOptLong, false);
                            } catch (Exception unused) {
                                sharedPreferences.edit().remove(key).apply();
                                context = context2;
                            }
                        } else {
                            context2 = context;
                            sharedPreferences.edit().remove(key).apply();
                        }
                    } catch (Exception unused2) {
                        context2 = context;
                    }
                    context = context2;
                }
            }
        }
    }
}
