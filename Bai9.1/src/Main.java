public class Main {
     public static void main(String[] args) {
        Salary<Integer> luong1 = new Salary<>(100000);
        luong1.print();
        Salary<Float> luong2 = new Salary<>(10000F);
        luong2.print();
        Salary<Long> luong3 = new Salary<>(30000l);
        luong3.print();
    }
}