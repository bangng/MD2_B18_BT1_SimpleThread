public class Main {
    public static void main(String[] args) {
        NumberGenertor n1 = new NumberGenertor();
        NumberGenertor n2 = new NumberGenertor();
        Thread thread1 = new Thread(n1);
        Thread thread2 = new Thread(n2);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
    }
}
