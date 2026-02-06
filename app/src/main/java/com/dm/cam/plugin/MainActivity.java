package com.dm.cam.plugin;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;


public class MainActivity extends AppCompatActivity {
    String key = "csc_pref_camera_forced_shuttersound_key";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateScreen();

        SwitchCompat sw = findViewById(R.id.sw);
        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= 23 && !canWrite()) {
                    sw.setChecked(!sw.isChecked());
                    requestPermission();
                    return;
                }

                if (MainActivity.this.get() != 1) {
                    Settings.System.putInt(MainActivity.this.getContentResolver(), MainActivity.this.key, 1);
                    sw.setChecked(true);
                    sw.setText(R.string.on);
                    return;
                }

                Settings.System.putInt(MainActivity.this.getContentResolver(), MainActivity.this.key, 0);
                sw.setChecked(false);
                sw.setText(R.string.off);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateScreen();
    }

    public void updateScreen() {
        SwitchCompat sw = (SwitchCompat) findViewById(R.id.sw);
        int val = get();

        if (val == 1) {
            sw.setChecked(true);
            sw.setText(R.string.on);
        } else if (val == 0) {
            sw.setChecked(false);
            sw.setText(R.string.off);
        } else {
            sw.setChecked(false);
            sw.setText(R.string.un);
        }
    }

    public int get() {
        return Settings.System.getInt(getContentResolver(), this.key, 2);
    }

    @TargetApi(Build.VERSION_CODES.M)
    public boolean canWrite() {
        return Settings.System.canWrite(this);
    }

    @TargetApi(Build.VERSION_CODES.M)
    public void requestPermission() {
        Toast.makeText(this, R.string.per, Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(() -> startActivity(new Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS, Uri.parse("package:"+getPackageName()))), 500);
    }
}