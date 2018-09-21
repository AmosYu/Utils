package com.rd.utils.ed.nativejni;

import android.app.Activity;
import android.os.Bundle;

import com.rd.utils.R;

public class JniActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    static {
        System.loadLibrary("native-lib");
    }


}
