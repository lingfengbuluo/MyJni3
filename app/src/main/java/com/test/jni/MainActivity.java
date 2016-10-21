package com.test.jni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private HelloJni helloJni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloJni = new HelloJni();
    }

    public void click(View view) {
        String string = helloJni.getNativeStr();
        Toast.makeText(this, "" + string, Toast.LENGTH_LONG).show();
    }
}
