package com.wjc.baseandroid.base;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.wjc.baseandroid.R;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_base);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);

        /**
         * Toggle start animation
         * R.anim.slide_in_right:新的Activity进入时的动画，这里是指OtherActivity进入时的动画
         * R.anim.slide_out_left：旧的Activity出去时的动画，这里是指this进入时的动画
         */
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override
    public void finish() {
        super.finish();

        // Toggle stop animation
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
