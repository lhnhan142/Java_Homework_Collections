import java.util.Arrays;

public class Employee<S> {
    private int id;
    private String name;
    private S salaries[];

    //Constructor
    public Employee(int id, String name, S[] salary) {
        this.id = id;
        this.name = name;
        this.salaries = salary;
    }

    //getter - setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public S[] getSalary() {
        return salaries;
    }

    public void setSalary(S[] salary) {
        this.salaries = salary;
    }

    //Method
    public void print()
    {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.print("Salaries: ");
        for(S i : salaries)
        {
            System.out.println(i + "\t");
        }
    }

    public void printLastSalaryMonth()
    {
        System.out.println("Last month's salary " + salaries[salaries.length - 1]);
        System.out.println();
    }
}
