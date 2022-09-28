package metodOverLoading;

public class Main {
    public static void main(String[] args) {
        CalculateManager calculateManager = new CalculateManager();
        int topla2 = calculateManager.topla(2,3);
        int topla3 =calculateManager.topla(2,3,4);
        System.out.println(topla2);
        System.out.println(topla3);
    }
}
