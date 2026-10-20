package lesson146;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Thread 1 dayandırıldı.");
            }
        }
    }
}