package com.rd.utils.ed.activity;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rd.utils.R;

public class ThirdActivity extends Activity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // 获取activity任务栈
        ActivityManager manager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        ActivityManager.RunningTaskInfo info = manager.getRunningTasks(1).get(0);

        String packageName = info.topActivity.getPackageName();
        String topclassName = info.topActivity.getClassName();
        String baseclassname = info.baseActivity.getClassName();
        int acitivitynum = info.numActivities;


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.test_btn){
            Intent intent = new Intent();
            intent.setClass(this,Ed_Activity_Activity.class);
            startActivity(intent);
        }
    }
}
