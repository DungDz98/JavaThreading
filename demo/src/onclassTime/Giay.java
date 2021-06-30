package onclassTime;

import java.time.LocalDateTime;

public class Giay extends Thread {
    @Override
    public void run() {
        while (true) {
        LocalDateTime now = LocalDateTime.now();
        int second = now.getSecond();
            for (int i = second; i < 60; i++) {
                System.out.print(" " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
    }
}
