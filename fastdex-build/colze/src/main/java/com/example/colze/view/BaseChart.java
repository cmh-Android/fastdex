package com.example.colze.view;
 
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
 
public class BaseChart extends View {
 
    /*
     * (non-Javadoc)
     * 
     * @param context
     * 
     * @see android.view.View#BaseChart(Context)
     */
    public BaseChart(Context context) {
        super(context);
    }
 
    /*
     * (non-Javadoc)
     * 
     * @param context
     * 
     * @param attrs
     * 
     * @see android.view.View#BaseChart(Context, AttributeSet)
     */
    public BaseChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
 
    /*
     * (non-Javadoc)
     * 
     * @param context
     * 
     * @param attrs
     * 
     * @param defStyle
     * 
     * @see android.view.View#BaseChart(Context, AttributeSet, int)
     */
    public BaseChart(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
 
    /*
     * (non-Javadoc)
     * 
     * @param widthMeasureSpec
     * 
     * @param heightMeasureSpec
     * 
     * @see android.view.View#onMeasure(int, int)
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
 
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(measureWidth(widthMeasureSpec),
                measureHeight(heightMeasureSpec));
    }
 
    /*
     * (non-Javadoc)
     * 
     * @param gainFocus
     * 
     * @param direction
     * 
     * @param previouslyFocusedRect
     * 
     * @see android.view.View#onFocusChanged(boolean, int,
     * android.graphics.Rect)
     */
    @Override
    protected void onFocusChanged(boolean gainFocus, int direction,
            Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
    }
 
    private int measureWidth(int measureSpec) {
        int result = 0;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);
 
        if (specMode == MeasureSpec.EXACTLY) {
            result = specSize;
        } else if (specMode == MeasureSpec.AT_MOST) {
            result = Math.min(result, specSize);
        }
        return result;
    }
 
    private int measureHeight(int measureSpec) {
        int result = 0;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);
 
        if (specMode == MeasureSpec.EXACTLY) {
            result = specSize;
        } else if (specMode == MeasureSpec.AT_MOST) {
            result = Math.min(result, specSize);
        }
        return result;
    }
}