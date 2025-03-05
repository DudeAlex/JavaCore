package hausaufgabe.lektion22.yinjang;

public class YinJangRunnable implements Runnable{

    String name;
    int sleepTime;

    public YinJangRunnable(String name, int sleepTime){
        this.name = name;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run(){
        for(int i = 0; i < 10; i++) {
            try{
                System.out.println(name);
                Thread.sleep(sleepTime);
            } catch(InterruptedException e){
            }
        }
    }

}
