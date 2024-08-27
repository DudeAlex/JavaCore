package inputoutputstreams.shmidt;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new MultiNewThread("Один"); // запустить потоки на исполнение
        new MultiNewThread("Два");
        new MultiNewThread("Три");

        try{
            //ожидать завершения других потоков исполнения
            Thread.sleep(10000);
        } catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
