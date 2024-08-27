package inputoutputstreams.shmidt;

// применяем методы join and isAlive

    public class MultiNewThread implements Runnable{
        String name; //имя потока исполнения
        Thread t;
        MultiNewThread (String threadname) {
            name = threadname;
            //создать новый, второй поток исполнения
            t = new Thread(this, name);
            System.out.println("Новый поток: " + t);
            t.start();   // запустить поток исполнения
        }

        // Точка входа во второй поток исполнения
        public void run() {
            try{
                for(int i = 5; i > 0; i--){
                    System.out.println(name + ": " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException е) {
                System.out.println(name + " прерван.");
            }
            System.out.println(name + " завершен.");
        }
    }

