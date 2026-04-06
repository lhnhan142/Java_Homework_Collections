public class Main {

    public static <T extends Comparable<T>> T max(T a, T b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Integer a = 10, b = 20;
        System.out.println("Max Integer: " + max(a, b));

        Double x = 5.5, y = 2.3;
        System.out.println("Max Double: " + max(x, y));

        Float m = 7.2f, n = 9.8f;
        System.out.println("Max Float: " + max(m, n));

        Long p = 100L, q = 50L;
        System.out.println("Max Long: " + max(p, q));
    }
}