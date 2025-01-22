class CustomRunnable implements Runnable {
    private String message;

    public CustomRunnable(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        CustomRunnable r1 = new CustomRunnable("Runnable Thread 1 is running...");
        CustomRunnable r2 = new CustomRunnable("Runnable Thread 2 is running...");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
