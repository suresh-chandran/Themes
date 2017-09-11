package com.suresh.themes;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by administrator on 16/5/17.
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    public void setTheme(){
        String theme = Prefrence.with(this).getSelectedTheme();
        if(theme != null){
            switch (theme){
                case "theme1":
                    setTheme(R.style.Theme1);
                    break;
                case "theme2":
                    setTheme(R.style.Theme2);
                    break;
                case "theme3":
                    setTheme(R.style.Theme3);
                    break;
                case "theme4":
                    setTheme(R.style.Theme4);
                    break;
            }
        }
    }

    public void setNoActionbarTheme(){
        String theme = Prefrence.with(this).getSelectedTheme();
        if(theme != null){
            switch (theme){
                case "theme1":
                    setTheme(R.style.Theme1_NoActionBar);
                    break;
                case "theme2":
                    setTheme(R.style.Theme2_NoActionBar);
                    break;
                case "theme3":
                    setTheme(R.style.Theme3_NoActionBar);
                    break;
                case "theme4":
                    setTheme(R.style.Theme4_NoActionBar);
                    break;
                default:
                    setTheme(R.style.AppTheme_NoActionBar);
                    break;
            }
        }else{
            setTheme(R.style.AppTheme_NoActionBar);
        }
    }
}
