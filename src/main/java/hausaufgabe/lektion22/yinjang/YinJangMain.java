package hausaufgabe.lektion22.yinjang;

public class YinJangMain {
    public static void main(String[] args) {


        //Vererbung
        /*YinJang yin = new YinJang("Yin", 500);
        YinJang jang = new YinJang("Jang", 5000);

        yin.start();
        jang.start();*/


        //Runnable
        /*YinJangRunnable yin = new YinJangRunnable("Yin", 500);
        YinJangRunnable jang = new YinJangRunnable("Jang", 5000);

        Thread t1 = new Thread(yin);
        Thread t2 = new Thread(jang);

        t1.start();
        t2.start();*/



        // Anonyme Klasse
        /*Thread t1 = new Thread(){

            String name = "Yin";
            int sleepTime = 500;

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
        };
        Thread t2 = new Thread(){
            String name = "Jang";
            int sleepTime = 5000;
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
        };

        t1.start();
        t2.start();*/
        

    }
}
