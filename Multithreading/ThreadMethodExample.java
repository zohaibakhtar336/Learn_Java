class MyThread extends Thread {
    @Override
    public void run() {
        // Display current thread details
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName() + " is running...\n");
    }
}

public class ThreadMethodExample {
    public static void main(String[] args) {
        // Create thread objects
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        // Set custom names
        thread1.setName("Worker-1");
        thread2.setName("Worker-2");
        thread3.setName("Worker-3");

        // Set priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Lowest priority
        thread2.setPriority(Thread.NORM_PRIORITY); // Default priority
        thread3.setPriority(Thread.MAX_PRIORITY); // Highest priority

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Main thread details
        System.out.println("\nMain Thread Details:");
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName() + " is finished.");
    }
}
