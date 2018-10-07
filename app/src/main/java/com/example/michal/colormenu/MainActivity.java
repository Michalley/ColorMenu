package com.example.michal.colormenu;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout la;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        la = (RelativeLayout) findViewById(R.id.la);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.blueC)
            la.setBackgroundColor(Color.BLUE);
        if (id == R.id.blackC)
            la.setBackgroundColor(Color.BLACK);
        if (id == R.id.greenC)
            la.setBackgroundColor(Color.GREEN);
        return super.onOptionsItemSelected(item);
    }

    public void next(View view) {
        Intent t = new Intent (this,Main2Activity.class);
        startActivity(t);
    }
}
