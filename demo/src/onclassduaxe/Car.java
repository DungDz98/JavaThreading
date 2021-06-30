package onclassduaxe;


public class Car implements Runnable {
    private final int speed;
    private String name;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void run() {
        int quangDuong = 0;

        long startTime = System.currentTimeMillis();
        while (quangDuong < 1000) {
            try {
                quangDuong += speed;
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Xe " + this.name + " ve dich het " + (endTime - startTime) + " ms");
    }
}
