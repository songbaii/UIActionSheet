package com.android.uiactionsheet;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showTitle(View view) {
        UIActionSheet.Builder builder = new UIActionSheet.Builder(this);
        builder.setTitle("我是标题", Color.RED);
        builder.addOption("Item 1", Color.RED, new UIActionSheet.OnOptionClickListener() {
            @Override
            public void onOptionClickListener() {
                Toast.makeText(MainActivity.this, "点击 Item 1", Toast.LENGTH_SHORT).show();
            }
        }).addOption("Item 2", Color.RED, new UIActionSheet.OnOptionClickListener() {
            @Override
            public void onOptionClickListener() {
                Toast.makeText(MainActivity.this, "点击 Item 2", Toast.LENGTH_SHORT).show();
            }
        }).create().show();
    }

    public void showNoTitle(View view) {
        new UIActionSheet.Builder(this).
                addOption("Item 1", Color.RED, new UIActionSheet.OnOptionClickListener() {
                    @Override
                    public void onOptionClickListener() {
                        Toast.makeText(MainActivity.this, "点击 Item 1", Toast.LENGTH_SHORT).show();
                    }
                }).addOption("Item 2", Color.RED, new UIActionSheet.OnOptionClickListener() {
            @Override
            public void onOptionClickListener() {
                Toast.makeText(MainActivity.this, "点击 Item 2", Toast.LENGTH_SHORT).show();
            }
        }).create().show();
    }
}
