public class Main {

    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[] {6, 4, 3});
        long max = salesManager.max();
        System.out.println(max);
    }
}
