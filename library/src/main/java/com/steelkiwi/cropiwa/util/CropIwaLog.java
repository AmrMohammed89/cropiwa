package com.steelkiwi.cropiwa.util;

import android.util.Log;

/**
 * Created by yarolegovich on 06.02.2017.
 */

public class CropIwaLog {

    private static final String LOG_TAG = "CropIwaLog";

    private static boolean LOG_ON = true;

    public static void d(String formatStr, Object ...args) {
        if (LOG_ON) {
            Log.d(LOG_TAG, String.format(formatStr, args));
        }
    }

    public static void e(String message, Throwable e) {
        if (LOG_ON) {
            Log.e(LOG_TAG, message, e);
        }
    }

    public static void setLog(boolean enabled) {
        LOG_ON = enabled;
    }
}
