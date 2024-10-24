package inputoutputstreams.shmidt;

/*public class NewThread extends Thread{
    NewThread(){
        // создать новый поток исполнения
        super("Демонстрационный поток");
        System.out.println("Дочерний поток: " + this);
        start(); //запустить поток на исполнение
    }

    // Точка входа во второй поток исполнения
    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Дoчepний поток прерван.");
        }
        System.out.println("Дoчepний поток завершен.");
    }
}*/


 public class NewThread implements Runnable{
    Thread t;
    NewThread () {
        //создать новый, второй поток исполнения
        t = new Thread(this, "Демонстрационный поток");
        System.out.println("Дoчepний поток создан: " + t);
        t.start();   // запустить поток исполнения
    }

    // Точка входа во второй поток исполнения
     public void run() {
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException е) {
            System.out.println("Дoчepний поток прерван.");
        }
        System.out.println("Дoчepний поток завершен.");
    }
}

