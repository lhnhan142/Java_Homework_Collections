public class MyNumber <N extends Number>{
    private N value;

    //Constructor
    public MyNumber(N value) {
        this.value = value;
    }

    //to string
    @Override
    public String toString() {
        return "MyNumber{" +
                "value=" + value +
                '}';
    }
}
