package com.bawei.zhangwei;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2017/7/10.
 */

public class MyEditText extends LinearLayout {

    private EditText mEditText;
    private Button bAdd;
    private Button bReduce;

    //这里的构造一定是两个参数。
    public MyEditText(final Context ctxt, AttributeSet attrs) {
        super(ctxt, attrs);
    }


    protected void onFinishInflate() {
        super.onFinishInflate();

        LayoutInflater.from(getContext()).inflate(R.layout.addview, this);
        init_widget();
        addListener();

    }

    //获得ID
    public void init_widget() {
        mEditText = (EditText) findViewById(R.id.edtext);
        bAdd = (Button) findViewById(R.id.add);
        bReduce = (Button) findViewById(R.id.jian);
        mEditText.setText("1");
    }

    //点击加号输入框的内容加一
    public void addListener() {
        bAdd.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                int num = Integer.valueOf(mEditText.getText().toString());
                num++;
                mEditText.setText(Integer.toString(num));
            }
        });
//点击减号输入框的内容减一
        bReduce.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                int num = Integer.valueOf(mEditText.getText().toString());
                num--;
                mEditText.setText(Integer.toString(num));

            }
        });
    }
}

