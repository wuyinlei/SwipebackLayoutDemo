package com.ruolan.swipebackout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ruolan.swipebackout.swipeback.SwipeBackActivityBase;
import com.ruolan.swipebackout.swipeback.SwipeBackActivityHelper;
import com.ruolan.swipebackout.swipeback.SwipeBackLayout;
import com.ruolan.swipebackout.swipeback.Utils;


/**
 * Created by sll on 2015/9/10 0010.
 */
public abstract class BaseSwipeBackActivity extends AppCompatActivity implements SwipeBackActivityBase {

    private SwipeBackActivityHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mHelper = new SwipeBackActivityHelper(this);
        mHelper.onActivityCreate();
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mHelper.onPostCreate();
    }

    @Override
    public View findViewById(int id) {
        View v = super.findViewById(id);
        if (v == null && mHelper != null) return mHelper.findViewById(id);
        return v;
    }

    @Override
    public SwipeBackLayout getSwipeBackLayout() {
        return mHelper.getSwipeBackLayout();
    }

    @Override
    public void setSwipeBackEnable(boolean enable) {
        getSwipeBackLayout().setEnableGesture(enable);
    }

    @Override
    public void scrollToFinishActivity() {
        Utils.convertActivityToTranslucent(this);
        getSwipeBackLayout().scrollToFinishActivity();
    }

    @Override
    public void finish() {
        super.finish();
    }



    @Override
    protected void onResume() {
        super.onResume();
       // int mode = SettingPrefUtil.getSwipeBackEdgeMode(this);
       /* SwipeBackLayout mSwipeBackLayout = mHelper.getSwipeBackLayout();
        switch (mode) {
            case 0:
                mSwipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_LEFT);
                break;
            case 1:
                mSwipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_RIGHT);
                break;
            case 2:
                mSwipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_BOTTOM);
                break;
            case 3:
                mSwipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_ALL);
                break;
        }*/
    }
}
