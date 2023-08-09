package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//      System.out.println(obj.name);       //java: name has private access in com.driver.RWOnly

//        set a value to a name
        obj.setName("Prajwal Hole");

//        get a value
        System.out.println(obj.getName());
    }
}