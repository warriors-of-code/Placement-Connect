package com.shivamvk.placementconnect.Managers;

import android.content.Context;

public class SharedPrefManager {
    private static SharedPrefManager sharedPrefManager;
    private static Context context;

    private static final String SHARED_PREF_STRING_NAME = "name";
    private static final String SHARED_PREF_STRING_EMAIL = "email";
    private static final String SHARED_PREF_STRING_PHONE = "phone";

    private static final String SHARED_PREF_NAME = "MySharedPref";

    private SharedPrefManager(Context context) {
        SharedPrefManager.context = context;
    }

    public static synchronized SharedPrefManager getInstance(Context context) {
        if (sharedPrefManager == null) {
            sharedPrefManager = new SharedPrefManager(context);
        }
        return sharedPrefManager;
    }
}
