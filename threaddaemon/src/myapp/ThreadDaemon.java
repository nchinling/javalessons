package myapp;

class MyThread extends Thread{
    public void run(){
        int count = 1;

        while(true){
            System.out.println(count++ +"My thread");
            MyThread.yield();
            // try {
            //     MyThread.sleep(100);
            // } catch (InterruptedException e) {
                
            //     e.printStackTrace();
            
        }
    }
}

public class ThreadDaemon{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        // t.setDaemon(true);
        t.start();

        int count = 1;

        while(true){
            System.out.println(count++ +"Main");
            // Thread.yield();
        }
        // Thread mainThread = Thread.currentThread();
        // try {
        //     mainThread.join();
        // } catch (InterruptedException e) {
            
        //     e.printStackTrace();
        // }

        // try{Thread.sleep(1000);} catch (Exception e){}
    }
}