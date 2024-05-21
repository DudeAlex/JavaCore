package mitarbeiter;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private final double baseSalary = 1000;
    private String birthday;

    public Employee(String firstName, String lastName, int id, String birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
