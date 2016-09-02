package com.assignment.submission;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by YOUHAI on 9/1/2016.
 */
public class CircleView extends View {
    private Paint paint;
    private float x;
    private float y;
    private float radius;
    public CircleView(Context context, int color, float x, float y, float radius) {
        super(context);
        this.x = x;
        this.y = y;
        this.radius = radius;
        paint = new Paint();
        paint.setColor(color);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2f);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.RED);
        canvas.drawCircle(x,y,radius,paint);
    }
}
