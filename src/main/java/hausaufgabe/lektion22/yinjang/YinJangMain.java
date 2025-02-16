package hausaufgabe.lektion22.yinjang;

public class YinJangMain {
    public static void main(String[] args) {


        YinJang yin = new YinJang("Yin", 500);
        YinJang jang = new YinJang("Jang", 5000);

        yin.start();
        jang.start();
    }
}
