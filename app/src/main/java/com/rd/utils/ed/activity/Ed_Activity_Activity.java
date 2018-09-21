package com.rd.utils.ed.activity;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.rd.utils.R;

/**
 * Android 组件一  Activity
 * 本业包含
 *      1.Activity的生命周期
 *      2.
 *
 */
public class Ed_Activity_Activity extends Activity implements View.OnClickListener{

    private static final String TAG = "Ed_Activity_Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ed_activity);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");
        ActivityManager manager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        ActivityManager.RunningTaskInfo info = manager.getRunningTasks(1).get(0);

        String packageName = info.topActivity.getPackageName();
        String topclassName = info.topActivity.getClassName();
        String baseclassname = info.baseActivity.getClassName();
        int acitivitynum = info.numActivities;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume:123 ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.jump_second_activity){
            Intent intent = new Intent();
            intent.setClass(this,SecondActivity.class);
            startActivity(intent);
        }
    }
}
