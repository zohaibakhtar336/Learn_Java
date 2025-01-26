class MyThread extends Thread {
    @Override
    public void run() {
        // Thread is running and executing the run() method
        System.out.println(Thread.currentThread().getName() + " is in Running state.");
        
        try {
            Thread.sleep(1000);  // Thread sleeps for 1 second (Timed Waiting state)
            System.out.println(Thread.currentThread().getName() + " is in Timed Waiting state.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        // Thread has finished execution and is in Terminated state
        System.out.println(Thread.currentThread().getName() + " is in Terminated state.");
    }
}

public class ThreadLifeCycle {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();  // Thread is in New state
        System.out.println(t1.getName() + " is in New state.");
        
        t1.start();  // Thread is in Runnable state (ready to run)
        System.out.println(t1.getName() + " is in Runnable state.");

        try {
            t1.join();  // Main thread waits for t1 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        // Thread has completed its work and is in Terminated state
        System.out.println(t1.getName() + " is in Terminated state.");
    }
}
