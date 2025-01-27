class Table {
    // Method without synchronization
    void printTableWithoutSync(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i + " (Without Sync)");
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    // Method with synchronization (because we are using synchronized keyword)
    synchronized void printTableWithSync(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i + " (With Sync)");
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

// Thread for calling the method without synchronization
class MyThreadWithoutSync extends Thread {
    Table t;

    MyThreadWithoutSync(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTableWithoutSync(5);
    }
}

// Thread for calling the method with synchronization
class MyThreadWithSync extends Thread {
    Table t;

    MyThreadWithSync(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTableWithSync(100);
    }
}

public class TestSynchronizationExample {
    public static void main(String[] args) {
        Table obj = new Table();

        // Threads without synchronization
        MyThreadWithoutSync t1 = new MyThreadWithoutSync(obj);
        MyThreadWithoutSync t2 = new MyThreadWithoutSync(obj);

        // Threads with synchronization
        MyThreadWithSync t3 = new MyThreadWithSync(obj);
        MyThreadWithSync t4 = new MyThreadWithSync(obj);

        // Start threads without synchronization
        System.out.println("Without Synchronization:");
        t1.start();
        t2.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        // Start threads with synchronization
        System.out.println("\nWith Synchronization:");
        t3.start();
        t4.start();
    }
}
