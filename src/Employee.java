import java.util.Objects;

public class Employee {
    private static int count = 1;
    private String fullName;
    private int dept;
    private double salary;
    private int id = 0;


    public int getId () {
        return id;
        }

    public Employee(String name, int dept, double salary) {
        this.fullName = name;
        this.dept = dept;
        this.salary = salary;
        id = count++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return getFullName() + "(id:" + getId() + ")" + " работает в отделе №: "
                + getDept() + " и имеет зарплату " + getSalary() + " рублей";
    }

}
