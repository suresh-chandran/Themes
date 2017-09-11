package com.suresh.themes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThemeChooserActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_chooser);
    }

    public void Default(View v){
        Prefrence.with(ThemeChooserActivity.this).setSelectedTheme(null);
        startActivity(new Intent(ThemeChooserActivity.this, SplashActivity.class));
        finish();
    }
    public void theme1(View v){
        Prefrence.with(ThemeChooserActivity.this).setSelectedTheme("theme1");
        startActivity(new Intent(ThemeChooserActivity.this, SplashActivity.class));
        finish();
    }
    public void theme2(View v){
        Prefrence.with(ThemeChooserActivity.this).setSelectedTheme("theme2");
        startActivity(new Intent(ThemeChooserActivity.this, SplashActivity.class));
        finish();
    }
    public void theme3(View v){
        Prefrence.with(ThemeChooserActivity.this).setSelectedTheme("theme3");
        startActivity(new Intent(ThemeChooserActivity.this, SplashActivity.class));
        finish();
    }
    public void theme4(View v){
        Prefrence.with(ThemeChooserActivity.this).setSelectedTheme("theme4");
        startActivity(new Intent(ThemeChooserActivity.this, SplashActivity.class));
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(ThemeChooserActivity.this, MainActivity.class));
        finish();
    }
}
