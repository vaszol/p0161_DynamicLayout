package com.example.vas.p0161_dynamiclayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**объекты с базовым типом:
         * android.view.ViewGroup.LayoutParams
         * (настраиваемая ширина и высота)
         * */
//        создание LinearLayout
        LinearLayout linLayout = new LinearLayout(this);
//        устанавливаем вертикальную ориентацию
        linLayout.setOrientation(LinearLayout.VERTICAL);
//        создаём LayoutParams
        LayoutParams linLayoutParam = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
//        устанавливаем linLayout как корневой элемент экрана
        setContentView(linLayout, linLayoutParam);

        LayoutParams lpView = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//        создаём тектовое поле с параметрами и lpView
        TextView tv = new TextView(this);
        tv.setText("TextView");
        tv.setLayoutParams(lpView);
        linLayout.addView(tv);
//        создаём кнопку с параметрами и lpView
        Button btn = new Button(this);
        btn.setText("Button");
        linLayout.addView(btn, lpView);
        /**объекты с базовым типом:
         *android.widget.LinearLayout
         * (дополнен отступами и выравниванием)
         * */
//        компонент с отступом 50 пикселей:
         LinearLayout.LayoutParams leftMarginParams = new LinearLayout.LayoutParams(
          LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        leftMarginParams.leftMargin=50;

        Button btn1 = new Button(this);
        btn1.setText("Button1");
        linLayout.addView(btn1,leftMarginParams);
//        компонент с выравниванием по правому краю:
        LinearLayout.LayoutParams rightGravityParams = new LinearLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        rightGravityParams.gravity = Gravity.RIGHT;

        Button btn2 = new Button(this);
        btn2.setText("Button2");
        linLayout.addView(btn2,rightGravityParams);
     }

}
