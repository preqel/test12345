package com.example.test;

/**
 * Created by preqel on 2018/4/19.
 */

public class Demo {

    public String name="demo";
  //在demo里面增加了两行代码
    int a  = 1;
    int b = 1;
    double c = 1;
    double d = 1;


    public static synchronized void staticfunction() throws InterruptedException {
        for(int i=0;i<3;i++){
            Thread.sleep(1000);
            System.out.println("Static function running...");
        }
    }


    public synchronized  void function() throws  InterruptedException{

        for(int i=0;i< 3;i++){
            Thread.sleep(1000);
            System.out.println("function running...");
        }
    }

    public static void main(String[] args){


        final Demo demo = new Demo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    staticfunction();
                }catch(Exception e ){
                   e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    demo.function();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

    }
}
