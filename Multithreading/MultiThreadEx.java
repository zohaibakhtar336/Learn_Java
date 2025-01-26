class Task extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is starting...");

        try {
            // Step 1
            System.out.println(Thread.currentThread().getName() + " is performing Step 1...");
            Thread.sleep(1000);

            // Step 2
            System.out.println(Thread.currentThread().getName() + " is performing Step 2...");
            Thread.sleep(1000);

            // Step 3
            System.out.println(Thread.currentThread().getName() + " is performing Step 3...");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            // Handle interruption
            System.out.println(Thread.currentThread().getName() + " was interrupted!");
        }

        System.out.println(Thread.currentThread().getName() + " has finished all steps.");
    }
}

public class MultiThreadEx {
    public static void main(String[] args) {
        // Create threads
        Task task1 = new Task();
        Task task2 = new Task();

        // Set thread names
        task1.setName("Worker-1");
        task2.setName("Worker-2");

        // Start threads
        task1.start();
        task2.start();

        try {
            // Wait for task1 to finish
            task1.join();
            System.out.println(task1.getName() + " has completed. Now main thread continues.");
        } catch (InterruptedException e) {
            // Handle interruption
            System.out.println("Main thread interrupted while waiting for " + task1.getName());
        }

        System.out.println("Main thread is finished.");
    }
}
