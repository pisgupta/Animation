package com.example.pankaj.slidingmenu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Pankaj on 9/9/2015.
 */
public class MyGraphicsTest extends View {
    Paint paint;
    public MyGraphicsTest(Context mContext) {
        super(mContext);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        paint.setColor(Color.BLUE);
      canvas.drawLine(50, 100, 100, 400, paint);
        paint.setColor(Color.DKGRAY);
        canvas.drawCircle(100,200,100,paint);

    }
}
