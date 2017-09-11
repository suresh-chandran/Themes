package com.suresh.themes;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by administrator on 16/5/17.
 */

public class Prefrence {

    private static final String PREFS_NAME = "STHEME";
    private static final String THEME = "THEME";
    private static Prefrence mPreference;
    private static Context mContext;
    SharedPreferences.Editor editor;
    SharedPreferences pref;

    public Prefrence(){
        pref = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    public static Prefrence with(Context context) {
        mContext = context;
        if(mPreference == null)
            mPreference = new Prefrence();
        return mPreference;
    }

    public String getSelectedTheme() {
        return pref.getString(THEME, null);
    }

    public void setSelectedTheme(String theme) {
        editor = pref.edit();
        editor.putString(THEME, theme);
        editor.commit();
    }
}
