public class Main {
    static void main(String[] args) {
        //key là email
        Phone<String, String> phone1 = new Phone<>("nhan@gmail.com", "0123456789");
        System.out.println("Email: " + phone1.getKey()
                            + "\nSDT: " + phone1.getValue());
        //key là số thứ tự
        Phone<String, String> phone2 = new Phone<>("001", "01233187431");
        System.out.println("STT: " + phone2.getKey()
                + "\nSDT: " + phone2.getValue());
        //key là Tên người dùng
        Phone<String, String> phone3 = new Phone<>("Nhan", "12412414213");
        System.out.println("Name: " + phone3.getKey()
                + "\nSDT: " + phone3.getValue());
    }
}
