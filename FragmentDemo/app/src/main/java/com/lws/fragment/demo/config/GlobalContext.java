package com.lws.fragment.demo.config;

import android.content.Context;

/**
 * Created by lws on 2017/12/25.
 */

public class GlobalContext {
    private static Context sContext;

    public static Context getContext() {
        return sContext;
    }

    public static void setContext(Context context) {
        sContext = context;
    }
}
