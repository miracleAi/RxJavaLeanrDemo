package com.example.zhulinping.rxjavalearndemo.operator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.zhulinping.rxjavalearndemo.R;
import com.example.zhulinping.rxjavalearndemo.operator.utils.CreateUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OperatorCreateActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.create_btn)
    Button createBtn;
    @BindView(R.id.just_btn)
    Button justBtn;
    @BindView(R.id.from_btn)
    Button fromBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator_create);
        ButterKnife.bind(this);
        createBtn.setOnClickListener(this);
        fromBtn.setOnClickListener(this);
        justBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.create_btn:
                CreateUtils.create();
                break;
            case R.id.just_btn:
                CreateUtils.just();
                break;
            case R.id.from_btn:
                CreateUtils.from();
                break;
        }
    }
}
