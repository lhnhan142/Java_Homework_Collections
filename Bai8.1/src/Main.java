public class Main {
    static void main(String[] args) {
        Student<Integer> sv1 = new Student(1, "Nhan");
        Student<Float> sv2 = new Student(1.3, "Vien");
        Student<Double> sv3 = new Student(3.24323, "Ly");

        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
    }
}
