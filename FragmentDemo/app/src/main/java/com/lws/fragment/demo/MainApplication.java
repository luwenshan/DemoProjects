package com.lws.fragment.demo;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.lws.fragment.demo.config.GlobalContext;
import com.lws.fragment.demo.config.ThreadAwareDebugTree;
import com.lws.fragment.demo.db.DBOperator;
import com.lws.fragment.demo.util.PrefUtils;

import timber.log.Timber;

/**
 * Created by lws on 2017/12/25.
 */

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new ThreadAwareDebugTree());
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this);
        }
        GlobalContext.setContext(this);

        boolean isFirstLaunch = PrefUtils.getBoolean(PrefUtils.PREFS_KEY_IS_FIRST_LAUNCH, true);
        Timber.d("is first launch = %b", isFirstLaunch);
        if (isFirstLaunch) {
            DBOperator.insertData();
            PrefUtils.putBoolean(PrefUtils.PREFS_KEY_IS_FIRST_LAUNCH, false);
        }
    }
}
