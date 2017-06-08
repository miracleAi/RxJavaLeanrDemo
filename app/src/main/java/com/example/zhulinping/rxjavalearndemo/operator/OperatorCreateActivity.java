package com.example.zhulinping.rxjavalearndemo.operator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.zhulinping.rxjavalearndemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OperatorCreateActivity extends AppCompatActivity {

    @BindView(R.id.create_btn)
    Button createBtn;
    @BindView(R.id.defer_btn)
    Button deferBtn;
    @BindView(R.id.from_btn)
    Button fromBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator_create);
        ButterKnife.bind(this);
    }
}
