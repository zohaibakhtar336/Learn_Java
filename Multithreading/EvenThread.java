class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        evenThread.start();
    }
}
