package ex2;

public class TestThread {
    public static void main(String[] args) {
        EvenThread chan = new EvenThread();
        OddThread le = new OddThread();
        le.start();
        try {
            le.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chan.start();
    }
}
