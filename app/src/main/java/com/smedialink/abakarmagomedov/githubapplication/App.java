package com.smedialink.abakarmagomedov.githubapplication;

import android.app.Application;
import android.content.Context;

/**
 * Created by abakarmagomedov on 15/05/17.
 */

public class App extends Application {

    private ComponentsHolder componentsHolder;

    public static App getApp(Context context) {
        return (App)context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        componentsHolder = new ComponentsHolder(this);
        componentsHolder.init();
    }

    public ComponentsHolder getComponentsHolder() {
        return componentsHolder;
    }

}
