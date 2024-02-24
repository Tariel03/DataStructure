package org.example.Threads;

import org.example.Leetcode.Main;

public class ThreadMain {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();
        try{
            thread.join();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
//        System.out.println("Stopping");
////        stoppableRunnable.requestStop();
//        System.out.println("Stopped");




    }
}
