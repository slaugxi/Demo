package com.example.databindingdemo;

public class AddAge {
    public User user;
    public AddAge(User user){
        this.user = user;
    }
    public void addage(){
        user.age.set(user.age.get()+1);
    }
}
