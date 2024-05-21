package mitarbeiter;

public class Worker extends Employee{
    private final int coefficient = 1;
    private double salary;
    private boolean isBoss;

    public Worker(String firstName, String lastName, int id, String birthday) {
        super(firstName, lastName, id, birthday);
    }


    public int getCoefficient() {
        return coefficient;
    }

    public double getSalary() {
        double lohn = super.getBaseSalary() * coefficient;
        if(isBoss) return lohn * 1.1;
        return lohn;
    }


    public boolean isBoss() {
        return isBoss;
    }

    public void setBoss(boolean boss) {
        isBoss = boss;
    }
}
