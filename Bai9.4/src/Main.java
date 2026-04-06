public class Main {
    public static void main(String[] args) {
        // Demo với kiểu Integer
        MyMath<Integer> intMath = new MyMath<>();
        System.out.println("--- DEMO VỚI INTEGER ---");
        System.out.println("Tổng 2 số (10, 20): " + intMath.sum(10, 20));
        System.out.println("Tổng 3 số (10, 20, 30): " + intMath.sum(10, 20, 30));
        System.out.println("Tổng 4 số (1, 2, 3, 4): " + intMath.sum(1, 2, 3, 4));
        System.out.println("Hiệu 2 số (50, 15): " + intMath.sub(50, 15));
        System.out.println("Lũy thừa (2^10): " + intMath.pow(2, 10));

        System.out.println();

        // Demo với kiểu Double
        MyMath<Double> doubleMath = new MyMath<>();
        System.out.println("--- DEMO VỚI DOUBLE ---");
        System.out.println("Tổng 2 số (5.5, 4.5): " + doubleMath.sum(5.5, 4.5));
        System.out.println("Hiệu 2 số (10.0, 2.5): " + doubleMath.sub(10.0, 2.5));
        System.out.println("Lũy thừa (3.5^2): " + doubleMath.pow(3.5, 2.0));

        System.out.println();

        // Demo với kiểu Long
        MyMath<Long> longMath = new MyMath<>();
        System.out.println("--- DEMO VỚI LONG ---");
        System.out.println("Tổng 3 số (100L, 200L, 300L): " + longMath.sum(100L, 200L, 300L));
    }
}
