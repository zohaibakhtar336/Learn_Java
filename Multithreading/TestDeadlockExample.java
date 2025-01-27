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

class DeadlockExample extends Thread {
    Resource r1, r2;
    
    DeadlockExample(Resource r1, Resource r2) {
        this.r1 = r1;
        this.r2 = r2;
    }
    
    public void run() {
        r1.method1(r2);
    }
}

public class TestDeadlockExample {
    public static void main(String[] args) {
        Resource res1 = new Resource();
        Resource res2 = new Resource();
        
        DeadlockExample t1 = new DeadlockExample(res1, res2); 
        DeadlockExample t2 = new DeadlockExample(res2, res1);
        
        t1.start();
        t2.start();
    }
}
