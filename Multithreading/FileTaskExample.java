class FileTask extends Thread {
    @Override
    public void run() {
        System.out.println("Task Started by: " + Thread.currentThread().getName());
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());

        try {
            System.out.println(Thread.currentThread().getName() + " is performing its task...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted!");
        }

        System.out.println("Task Completed by: " + Thread.currentThread().getName() + "\n");
    }
}

public class FileTaskExample {
    public static void main(String[] args) {
        FileTask downloadTask = new FileTask();
        FileTask processTask = new FileTask();
        FileTask saveTask = new FileTask();

        downloadTask.setName("Download-Task");
        processTask.setName("Process-Task");
        saveTask.setName("Save-Task");

        downloadTask.setPriority(Thread.MAX_PRIORITY);
        processTask.setPriority(Thread.NORM_PRIORITY);
        saveTask.setPriority(Thread.MIN_PRIORITY);

        downloadTask.start();
        processTask.start();
        saveTask.start();

        System.out.println("\nMain Thread Details:");
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
        System.out.println("Main thread has finished its work.");
    }
}
