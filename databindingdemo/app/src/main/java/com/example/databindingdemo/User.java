package com.example.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

public class User extends BaseObservable{
    public ObservableField<Integer> age = new ObservableField<Integer>();
    public ObservableField<String> name = new ObservableField<String>("");

    public  User(){
        age.set(0);
        name.set("Default");
    }



}
