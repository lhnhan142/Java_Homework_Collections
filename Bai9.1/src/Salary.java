public class Salary <N extends Number> {
    private N dataType;

    //Constructor
    public Salary(N dataType) {
        this.dataType = dataType;
    }

    //Method
    public void print()
    {
        System.out.println("Data type: " + this.dataType);
    }
}
