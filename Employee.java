import java.time.Year;

public abstract class Employee extends Person {
    protected String name;
    protected String SecondName;
    protected int hireDate;
    protected String companyName;
    protected double salary;

    public Employee(String firstName, String lastName, int birthdayYear, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getJobSeniority() {
        return Year.now().getValue() - hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public abstract void bite();
}
