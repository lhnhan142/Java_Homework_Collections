public class Main {
    public static void main(String[] args) {
        MyNumber<Integer> num1 = new MyNumber<>(1000000);
        System.out.println(num1);
        MyNumber<Double> num2 = new MyNumber<>(100.1111);
        System.out.println(num2);
        MyNumber<Long> num3 = new MyNumber<>(1000000L);
        System.out.println(num3);
    }
}
