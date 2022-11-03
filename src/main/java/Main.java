public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainGroup = new ThreadGroup("main group");
        Thread t1 = new Thread(mainGroup, new MyThread());
        Thread t2 = new Thread(mainGroup, new MyThread());
        Thread t3 = new Thread(mainGroup, new MyThread());
        Thread t4 = new Thread(mainGroup, new MyThread());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        Thread.sleep(15000);

        mainGroup.interrupt();

    }
}
