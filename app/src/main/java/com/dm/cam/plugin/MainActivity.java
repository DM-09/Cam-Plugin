package com.dm.cam.plugin;

import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class MainActivity extends AppCompatActivity {
    String key = "csc_pref_camera_forced_shuttersound_key";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int val = get();
        final SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.sw);
        if (val == 1) {
            switchCompat.setChecked(true);
            switchCompat.setText(R.string.on);
        } else if (val == 0) {
            switchCompat.setChecked(false);
            switchCompat.setText(R.string.off);
        } else {
            switchCompat.setChecked(false);
            switchCompat.setText(R.string.un);
        }
        switchCompat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val2 = MainActivity.this.get();
                if (val2 != 1) {
                    Settings.System.putInt(MainActivity.this.getContentResolver(), MainActivity.this.key, 1);
                    switchCompat.setChecked(true);
                    switchCompat.setText(R.string.on);
                    return;
                }
                Settings.System.putInt(MainActivity.this.getContentResolver(), MainActivity.this.key, 0);
                switchCompat.setChecked(false);
                switchCompat.setText(R.string.off);
            }
        });
    }

    public int get() {
        return Settings.System.getInt(getContentResolver(), this.key, 2);
    }
}