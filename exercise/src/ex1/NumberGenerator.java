package ex1;

public class NumberGenerator extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
            System.out.println(this.getName() + ":" + i + " ------- " + this.hashCode());
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator();
        NumberGenerator num2 = new NumberGenerator();
        num1.setName("A");
        num2.setName("B");
        num1.setPriority(Thread.MIN_PRIORITY);
        num2.setPriority(Thread.MAX_PRIORITY);
        num1.start();
        num2.start();

    }
}
