package myapp;

class MyThread extends Thread{
    
    //constructor
    public MyThread(String name){
        super(name);
        // setPriority(Thread.NORM_PRIORITY);

    }

    public void run()
    {
        int count = 1;

        // while(true && count <=20){
        while(true){
        
            System.out.println(count++);
            try {
               
                Thread.sleep(1500);
                // count++;
                
            } catch (InterruptedException e) {
                
                System.out.println("The thread has been interrupted.");
                e.printStackTrace();
            }
        
        }
    }
}

public class ThreadTest{
    public static void main(String[] args) {
        MyThread t = new MyThread("My Thread 1");
        System.out.println("ID "+ t.threadId());
        System.out.println("Name "+ t.getName());
        System.out.println("Priority "+ t.getPriority());
        t.start();
        t.interrupt();
        System.out.println("Alive " + t.isAlive()); 
        System.out.println("State " + t.getState());
        System.out.println("Alive " + t.isAlive()); 

    }
}