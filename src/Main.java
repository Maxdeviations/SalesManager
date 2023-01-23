public class Main {

    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[] {6, 4, 3});
        int max = salesManager.max();
        System.out.println(max);
    }
}
