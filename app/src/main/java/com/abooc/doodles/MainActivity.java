package com.abooc.doodles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.abooc.android.AppApplication;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AppApplication appApplication = (AppApplication) getApplication();
        String versionName = appApplication.getVersionName(this);
        int versionCode = appApplication.getVersionCode(this);
        getSupportActionBar().setSubtitle(versionName + "(build:" + versionCode + ")");


        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        TextView appNameText = (TextView) findViewById(R.id.AppName);

        AppApplication appApplication = (AppApplication) getApplication();
        appNameText.setText(appApplication.getVersionName(this) + ":" + appApplication.getVersionCode(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
