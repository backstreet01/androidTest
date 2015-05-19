package com.ding.mixview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;

public class MixViewActivity extends Activity {
	
	int [] images = new int[]{
			R.drawable.java,
			R.drawable.ee,
			R.drawable.classic,
			R.drawable.ajax,
			R.drawable.xml
	};
	
	int currentImage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //使用 activity_mix_view.xml 定义的界面布局
        setContentView(R.layout.frame_layout);
        
        //获取布局器
        LinearLayout main = (LinearLayout) this.findViewById(R.id.root);
        //创建一个 ImageView
//        final ImageView image = new ImageView(this);
//        //将ImageView 添加到 布局器里
//        main.addView(image);
//        //设置ImageView 初始化时显示第一张图片
//        image.setImageResource(images[0]);
//        
//        //为 ImageView 添加单击事件
//        image.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View view) {
//				// TODO Auto-generated method stub
//				image.setImageResource(images[currentImage++ % images.length]);
//			}
//		});
        
//        DrawView drawView = new DrawView(this);
//        drawView.setMinimumWidth(300);
//        drawView.setMinimumHeight(500);
//        drawView.setBackgroundColor(Color.BLUE);
//        main.addView(drawView);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mix_view, menu);
        return true;
    }
    
}
