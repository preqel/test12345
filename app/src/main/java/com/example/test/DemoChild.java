package com.example.test;

/**
 * Created by preqel on 2018/4/25.
 */

public class DemoChild extends Demo {


    public   String name ="DemoChild";
    public static synchronized void staticfunction() throws InterruptedException {

        System.out.println("preqel");
    }

    public  static  void main(String[] args){
        DemoChild demoChild = new DemoChild();
        try {
            demoChild.staticfunction();
            System.out.println(demoChild.name);
        }catch (Exception e){
            e.printStackTrace();
        }
       // System.out.println("preqel");
    }
}
