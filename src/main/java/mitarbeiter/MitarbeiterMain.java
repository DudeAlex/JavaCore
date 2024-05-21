package mitarbeiter;

public class MitarbeiterMain {
    public static void main(String[] args) {

        Manager manager = new Manager(" ", "fsdf", 13, "15 January");
        System.out.println(manager.getSalary());
        Worker worker1 = new Worker(" ", "sdff", 12, "1 Mart");
        System.out.println(worker1.getSalary());
        Worker worker2 = new Worker(" ", "gsdg", 11, "25 December");
        System.out.println(worker2.getSalary());
        manager.makeBoss(worker1);
        System.out.println(worker1.getSalary());
        worker2.setBoss(true);
        System.out.println(worker2.getSalary());


    }
}
