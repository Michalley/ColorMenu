package com.example.michal.colormenu;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class Main2Activity extends AppCompatActivity {

    RelativeLayout la2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        la2=(RelativeLayout)findViewById(R.id.la2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        menu.add(0,0,400,"Red");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String st=item.getTitle().toString();
        int id = item.getItemId();
        if (id == R.id.blueC)
            la2.setBackgroundColor(Color.BLUE);
        if (id == R.id.blackC)
            la2.setBackgroundColor(Color.BLACK);
        if (id == R.id.greenC)
            la2.setBackgroundColor(Color.GREEN);
        if (st.equals("Red"))
            la2.setBackgroundColor(Color.RED);
        return super.onOptionsItemSelected(item);
    }

    public void back(View view) {
        Intent t = new Intent (this,MainActivity.class);
        startActivity(t);
    }
}
