package collections.viertesemester.zahlensumme;

import java.util.Arrays;
import java.util.List;

public class SummeMitThreads {

    public static void main(String[] args) throws InterruptedException {
        // Пример списка чисел
        List<Integer> zahlen = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Создаём два обработчика (каждый обрабатывает часть списка)
        SumRunnable r1 = new SumRunnable(zahlen.subList(0, 4)); // 1 + 2 + 3 + 4
        SumRunnable r2 = new SumRunnable(zahlen.subList(4, 8)); // 5 + 6 + 7 + 8

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        // Ждём завершения обоих потоков
        t1.join();
        t2.join();

        // Суммируем результаты
        int gesamtSumme = r1.getSumme() + r2.getSumme();
        System.out.println("Gesamtsumme = " + gesamtSumme);
    }

    // Класс, реализующий Runnable, считает сумму переданного списка
    static class SumRunnable implements Runnable {
        private List<Integer> zahlen;
        private int summe = 0;

        public SumRunnable(List<Integer> zahlen) {
            this.zahlen = zahlen;
        }

        public void run() {
            for (int zahl : zahlen) {
                summe += zahl;
            }
            System.out.println("Zwischensumme von " + zahlen + " = " + summe);
        }

        public int getSumme() {
            return summe;
        }
    }
}

