package com.pencamillo.android.activity;

import android.os.Bundle;

import com.pencamillo.android.R;

import butterknife.ButterKnife;

public class SignUpActivity extends BaseActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ButterKnife.bind(this);

        setTitle("Sign Up");

    }

}
