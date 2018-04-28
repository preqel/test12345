package com.example.test;

/**
 * Created by preqel on 2018/4/25.
 */

public class Task implements Runnable{

    boolean running = false;
    int i=0;


    @Override
    public void run() {
        while(running)
            i++;
    }

    public static void main(String[] args) throws  InterruptedException{


        Task task = new Task();
        Thread thread =new Thread(task);
        thread.start();
        Thread.sleep(10);
        task.running = false;
        Thread.sleep(100);
        System.out.println(task.i);
        System.out.println("程序停止");


    }

}
