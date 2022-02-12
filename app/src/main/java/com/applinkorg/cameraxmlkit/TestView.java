package com.applinkorg.cameraxmlkit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class TestView extends View {

    Paint paint;
    public TestView(Context context) {
        super(context);

        initView();
        initEvent();
        initData();
        initThread();
    }

    public TestView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        initView();
        initEvent();
        initData();
        initThread();
    }

    public TestView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        initView();
        initEvent();
        initData();
        initThread();
    }

    public TestView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        initView();
        initEvent();
        initData();
        initThread();
    }

    private void initView() {

    }

    private void initEvent() {

    }
    private void initData() {
        paint=new Paint();
        paint.setColor(Color.rgb(100,100,100));
    }

    private void initThread() {

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(0,0,100,paint);
    }
}
