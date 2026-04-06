import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> listWildcards = new ArrayList<>();
        listWildcards.add("Nguyễn Văn Nam");
        listWildcards.add("30 tuổi");
        listWildcards.add("Hà đông, Hà nội");
        System.out.println("Thông tin khách hàng: ");
        for (Object element : listWildcards) {
            System.out.println("- " + element);
        }
    }
}