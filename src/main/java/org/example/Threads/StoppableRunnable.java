package org.example.Threads;

public class StoppableRunnable implements Runnable{
    private boolean stopRequested = false;
    public synchronized void requestStop(){
        this.stopRequested = true;
    }
    public synchronized boolean isStopRequested(){
        return this.stopRequested;
    }
    public void sleep(long millis){
        try{
            Thread.sleep(millis);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
    @Override
    public void run() {
        System.out.println("Hello!");
        while(!isStopRequested()){
            sleep(1000);
            System.out.println("hiii");

        }
        System.out.println("Bye!");
    }
}
