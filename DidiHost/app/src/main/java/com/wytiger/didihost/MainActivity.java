package com.wytiger.didihost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;

import com.didi.virtualapk.PluginManager;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_start_plugin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String pluginPath = Environment.getExternalStorageDirectory().getAbsolutePath().concat("/Test.apk");
                    File plugin = new File(pluginPath);
                    PluginManager.getInstance(MainActivity.this).loadPlugin(plugin);

                    Intent intent = new Intent();
                    intent.setClassName("com.wytiger.didiplugin", "com.wytiger.didiplugin.PluginActivity");
                    startActivity(intent);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}
