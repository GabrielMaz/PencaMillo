package com.pencamillo.android.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.pencamillo.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity{

    @BindView(R.id.username)
    EditText mUsername;

    @BindView(R.id.password)
    EditText mPassword;

    @BindView(R.id.signup)
    Button mSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avtivity_login);

        ButterKnife.bind(this);

    }
}
