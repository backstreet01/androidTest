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
        //ʹ�� activity_mix_view.xml ����Ľ��沼��
        setContentView(R.layout.frame_layout);
        
        //��ȡ������
        LinearLayout main = (LinearLayout) this.findViewById(R.id.root);
        //����һ�� ImageView
//        final ImageView image = new ImageView(this);
//        //��ImageView ��ӵ� ��������
//        main.addView(image);
//        //����ImageView ��ʼ��ʱ��ʾ��һ��ͼƬ
//        image.setImageResource(images[0]);
//        
//        //Ϊ ImageView ��ӵ����¼�
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
