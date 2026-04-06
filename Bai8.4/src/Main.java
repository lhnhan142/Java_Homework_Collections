public class Main {
    static void main(String[] args) {
        Integer[] salary1 = {100, 200, 300};
        Employee<Integer> nv1 = new Employee<>(1, "Nhan", salary1);
        nv1.print();
        nv1.printLastSalaryMonth();

        Float[] salary2 = {100f, 200f, 300f};
        Employee<Float> nv2 = new Employee<>(2, "UIA", salary2);
        nv2.print();
        nv2.printLastSalaryMonth();

        Double[] salary3 = {100.1, 200.2, 300.3};
        Employee<Double> nv3 = new Employee<>(1, "Dio", salary3);
        nv3.print();
        nv3.printLastSalaryMonth();
    }
}
