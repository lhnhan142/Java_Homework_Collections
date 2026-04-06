public class Main {
    //method
    public static <E> void printArray(E[] arr)
    {
        for(E i : arr)
        {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    static void main(String[] args) {
        Integer a[] = new Integer[]{1,2,3,4};
        Float b[] = new Float[]{1.1f,1.2f, 1.3f, 1.4f};
        Long c[] = new Long[]{10l, 20l, 30l, 40l};
        Double d[] = new Double[]{1.1, 2.2, 3.3, 4.4};

        printArray(a);
        printArray(b);
        printArray(c);
        printArray(d);
    }
}
