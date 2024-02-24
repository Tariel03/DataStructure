package org.example.Threads;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 100; i++) {
            sleep(50);
            System.out.println("Hello! from "+ name + " " + i + " times");

        }
        System.out.println("Hello! "+ name);
    }
    public void sleep(long millis){
        try {
            Thread.sleep(millis);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
