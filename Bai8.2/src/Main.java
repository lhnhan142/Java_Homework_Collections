public class Main {
    //Generic method
    public static <T> void print(T a)
    {
        System.out.println(a);
    }

    static void main(String[] args) {
        print("Le Hoang Nhan");
        print(4);
        print(4.0);
        Student<Integer> sv = new Student(1, "Nhan");
        print(sv);
    }
}
