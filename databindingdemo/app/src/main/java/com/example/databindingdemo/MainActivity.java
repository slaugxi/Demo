package com.example.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.databindingdemo.databinding.Test;

public class MainActivity extends AppCompatActivity {
    private Test binding;
    private  User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        user = new User();
        binding.setAddAge(new AddAge(user));
        binding.setDataBean(user);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.name.set("改变成功1");
                user.age.set(20);
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.name.set("Default");
                user.age.set(0);
            }
        });

    }


}
