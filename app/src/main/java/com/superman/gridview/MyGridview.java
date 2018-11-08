package com.superman.gridview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

/**
 * 作者 Superman
 * 日期 14:19.
 * 文件 MyGridview
 * 描述
 */
public class MyGridview extends GridView {
    private Paint borderPaint;

    public MyGridview(Context context) {
        super(context);
    }


    public MyGridview(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int numColumns = getNumColumns();//列数
        if (numColumns < 1) return;
        int childCount = getChildCount();//子view个数
        if (childCount <= 0) return;
        int row = 0;
        if (childCount % numColumns == 0) {
            row = childCount / numColumns;
        } else {
            row = childCount / numColumns + 1;
        }
        if (row < 2) return;
        for (int i = 0; i <= row - 1; i++) {
            if (i < row - 1) {//除去最后一行其他都划线
                View leftChild = getChildAt(numColumns * i);//拿到i行，第一个子view来计算坐标位置
                int botom = leftChild.getBottom();
                int left = getLeft() + 100;
                int right = getRight() - 100;
                canvas.drawLine(left, botom, right, botom, borderPaint);
            }
        }
    }

    private void initPaint() {
        borderPaint = new Paint();
        borderPaint.setColor(R.color.colorPrimary);
        borderPaint.setStrokeWidth(2);
    }

}
