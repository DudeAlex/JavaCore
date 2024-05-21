package mitarbeiter;

public class Manager extends Employee {
    private final int coefficient = 2;
    private double salary;
    private Worker worker;

    public Manager(String firstName, String lastName, int id, String birthday) {
        super(firstName, lastName, id, birthday);
    }


    public int getCoefficient() {
        return coefficient;
    }

    public double getSalary() {
        return super.getBaseSalary() * coefficient;
    }

    public void makeBoss(Worker worker){
        worker.setBoss(true);
    }


}
