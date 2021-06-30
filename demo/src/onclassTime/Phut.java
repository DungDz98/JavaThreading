package onclassTime;

import java.time.LocalDateTime;

public class Phut extends Thread {
    @Override
    public void run() {
        while(true) {
            LocalDateTime now = LocalDateTime.now();
            int minute = now.getMinute();
            for (int i = minute; i < 60; i++) {
                System.out.print(" " + i);
                try {
                    Thread.sleep(60000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
    }
}
