public class Main {
    static void main(String[] args) {
        Staff<Integer, String> staff1 = new Staff<>(123, "Nhan");
        System.out.println("ID: " + staff1.getId()
                            + "\nName: " + staff1.getName());
        Staff<Long, String> staff2 = new Staff<>(123L, "UIA");
        System.out.println("ID: " + staff2.getId()
                + "\nName: " + staff2.getName());
    }
}
