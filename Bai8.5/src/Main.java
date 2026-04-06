public class Main {
    static void main(String[] args) {
        MyMap<Integer, String> Student = new MyMap<>(123, "Nhan");
        System.out.println("MSV: " + Student.getKey()
                            + "\nName: " + Student.getValue());
    }
}
