package com.hx.test.selfTest.streamTest;

/**
 * @program: leetcode
 * @description:
 * @author: hux
 * @create: 2020-09-10 17:37
 **/
public class User {
     private String name;
    private String sex;
    private  String job;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
