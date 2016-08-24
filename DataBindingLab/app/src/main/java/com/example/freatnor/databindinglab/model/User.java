package com.example.freatnor.databindinglab.model;

/**
 * Created by Jonathan Taylor on 8/24/16.
 */
public class User {
    private String userName;
    private String department;
    private int age;

    public User(String mUserName, String mDepartment, int mAge) {
        this.userName = mUserName;
        this.department = mDepartment;
        this.age = mAge;
    }

    public String getUserName() {
        return userName;
    }

    public String getDepartment() {
        return department;
    }

    public String getAge() {
        return age + "";
    }

    public void setAge(int age) {
        this.age = age;
    }
}
