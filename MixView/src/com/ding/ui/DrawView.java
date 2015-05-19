package com.ding.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class DrawView extends View{
	
	public float currentX = 50f;
	public float currentY = 40f;
	
	Paint p = new Paint();
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		//设置画笔的颜色
		p.setColor(Color.RED);
		canvas.drawCircle(currentX, currentX, 15, p);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		currentX = event.getX();
		currentY = event.getY();
		
		// 通知当前组件重绘自己
		invalidate();
		return true;
	}
	
	public DrawView(Context context) {
		super(context);
	}
	
	public DrawView(Context context, AttributeSet set) {
		super(context, set);
	}

}
