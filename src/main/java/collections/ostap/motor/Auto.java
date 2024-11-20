package collections.ostap.motor;

public class Auto {

    String brand;
    String model;
    Motor motor;

    public Auto(String brand, String model, Motor motor) {
        this.brand = brand;
        this.model = model;
        this.motor = motor;
    }

    public void startCar(){
        motor.ignite();
    }

    public static void main(String[] args) {
        Motor m1 = new DieselMotor();
        Auto a1 = new Auto("VW", "passat", m1);
        a1.startCar();
    }
}


