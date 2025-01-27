class Resource {
    synchronized void method1(Resource r) {
        System.out.println(Thread.currentThread().getName() + " entered method1");
        try { Thread.sleep(100); } catch (Exception e) {}
        r.last();
    }
    
    synchronized void last() {
        System.out.println(Thread.currentThread().getName() + " entered last");
    }
}

class DeadlockThread extends Thread {
    Resource r1, r2;
    
    DeadlockThread(Resource r1, Resource r2) {
        this.r1 = r1;
        this.r2 = r2;
    }
    
    public void run() {
        r1.method1(r2); // Thread tries to lock Resource1 and then Resource2
    }
}

public class TestDeadlock {
    public static void main(String[] args) {
        Resource res1 = new Resource();  // Create Resource 1
        Resource res2 = new Resource();  // Create Resource 2
        
        DeadlockThread t1 = new DeadlockThread(res1, res2); // Thread 1
        DeadlockThread t2 = new DeadlockThread(res2, res1); // Thread 2
        
        t1.start();  // Start Thread 1
        t2.start();  // Start Thread 2
    }
}
