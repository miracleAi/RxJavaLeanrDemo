package com.example.zhulinping.rxjavalearndemo.operator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.zhulinping.rxjavalearndemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OperatorActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.create_btn)
    Button createBtn;
    @BindView(R.id.change_btn)
    Button changeBtn;
    @BindView(R.id.filter_btn)
    Button filterBtn;
    @BindView(R.id.combine_btn)
    Button combineBtn;
    @BindView(R.id.help_btn)
    Button helpBtn;
    @BindView(R.id.error_btn)
    Button errorBtn;
    @BindView(R.id.connect_btn)
    Button connectBtn;
    @BindView(R.id.condition_btn)
    Button conditionBtn;
    @BindView(R.id.caculate_btn)
    Button caculateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator);
        ButterKnife.bind(this);
        createBtn.setOnClickListener(this);
        changeBtn.setOnClickListener(this);
        filterBtn.setOnClickListener(this);
        combineBtn.setOnClickListener(this);
        conditionBtn.setOnClickListener(this);
        connectBtn.setOnClickListener(this);
        errorBtn.setOnClickListener(this);
        helpBtn.setOnClickListener(this);
        caculateBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.create_btn:
                startActivity(new Intent(OperatorActivity.this,OperatorCreateActivity.class));
                break;
            case R.id.change_btn:
                break;
            case R.id.caculate_btn:
                break;
            case R.id.combine_btn:
                break;
            case R.id.condition_btn:
                break;
            case R.id.connect_btn:
                break;
            case R.id.help_btn:
                break;
            case R.id.error_btn:
                break;
            case R.id.filter_btn:
                break;
        }
    }
}
