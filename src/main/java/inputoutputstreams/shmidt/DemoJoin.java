package inputoutputstreams.shmidt;

public class DemoJoin {
    public static void main(String[] args) {
        MultiNewThread ob1 = new MultiNewThread("Один");
        MultiNewThread ob2 = new MultiNewThread("Два");
        MultiNewThread ob3 = new MultiNewThread("Три");

        System.out.println("Поток Один запущен: " + ob1.t.isAlive());
        System.out.println("Поток Два запущен: " + ob2.t.isAlive());
        System.out.println("Поток Три запущен: " + ob3.t.isAlive());
        // ожидать завершения потоков исполнения

        try{
            System.out.println("Ожижание завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Поток Один запущен: " + ob1.t.isAlive());
        System.out.println("Поток Два запущен: " + ob2.t.isAlive());
        System.out.println("Поток Три запущен: " + ob3.t.isAlive());
        System.out.println("Главный поток завершен");
    }
}
