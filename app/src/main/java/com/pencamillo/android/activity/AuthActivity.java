package com.pencamillo.android.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pencamillo.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AuthActivity extends BaseActivity{

    @BindView(R.id.signup)
    TextView signup;

    @BindView(R.id.login)
    Button login;

    private ProgressDialog loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        ButterKnife.bind(this);

        loading = new ProgressDialog(this);
        loading.setMessage(getString(R.string.loading));
        loading.setCancelable(false);
        loading.show();

        setTitle("Auth Activity");

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AuthActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(AuthActivity.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });


        loading.dismiss();
    }
}
