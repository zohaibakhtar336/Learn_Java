class MyTask extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is in Running state now.");

        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " is in Timed Waiting state.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(Thread.currentThread().getName() + " is now in Terminated state.");
    }
}

public class ThreadLifeCycleExample {
    public static void main(String[] args) {
        MyTask t1 = new MyTask();
        System.out.println(t1.getName() + " is in New state.");
        
        t1.start();
        System.out.println(t1.getName() + " is in Runnable state.");

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(t1.getName() + " is now in Terminated state.");
    }
}
