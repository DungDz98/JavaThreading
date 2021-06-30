package onclassduaxe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car xe1 = new Car("1", 30);
        Car xe2 = new Car("2", 30);

        Thread thread1 = new Thread(xe1);
        Thread thread2 = new Thread(xe2);

        thread1.start();
        thread2.start();
    }
}
