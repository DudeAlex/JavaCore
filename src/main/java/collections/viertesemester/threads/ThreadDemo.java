package collections.viertesemester.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new MeinThread();
        Thread t2 = new Thread(new MeinRunnable());
        Thread t3 = new Thread() {
            public void run(){
                for(int i = 5; i >= 0; i--){
                    System.out.println("Anonyme: " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread t4 = new Thread(() -> {
            for(int i = 5; i >= 0; i--){
                System.out.println("Lambda " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });



        t1.start(); t2.start(); t3.start(); t4.start();
        t1.join(); t2.join(); t3.join(); t4.join();

        System.out.println("Alle Threads beendet .");


    }

    public static class MeinThread extends Thread{
         public void run(){
             for(int i = 5; i >= 0; i--){
                 System.out.println("Mein " + i);
                 try {
                     Thread.sleep(500);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
        }
    }

    public static class MeinRunnable implements Runnable{

        public void run(){
            for(int i = 5; i >= 0; i--){
                System.out.println("runnable " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
