package com.example.gelige.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // get screen width\\
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int height = displaymetrics.heightPixels;
        int width = displaymetrics.widthPixels;
        //


        TextView tv = (TextView)findViewById(R.id.toolbarTv);
        ViewGroup.LayoutParams params = tv.getLayoutParams();
        params.width = width/4;
        tv.setLayoutParams(params);

        TextView tv1 = (TextView)findViewById(R.id.toolbarTv2);
        ViewGroup.LayoutParams params1 = tv1.getLayoutParams();
        params.width = width/4;
        tv1.setLayoutParams(params);

        TextView tv2 = (TextView)findViewById(R.id.toolbarTv3);
        ViewGroup.LayoutParams params2 = tv2.getLayoutParams();
        params.width = width/4;
        tv2.setLayoutParams(params);

        TextView tv3 = (TextView)findViewById(R.id.toolbarTv4);
        ViewGroup.LayoutParams params3 = tv3.getLayoutParams();
        params.width = width/4;
        tv3.setLayoutParams(params);
    }


}
