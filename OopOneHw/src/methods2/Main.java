package methods2;

public class Main {
    public static void main(String[] args) {
        int toplamaSonucu = topla(1,2,5,4,9);
        System.out.println(toplamaSonucu);
    }

    // Variable Arguments
    public static int topla(int... sayilar){
        int toplamSayilar = 0;
        for (int sayi:sayilar) {
            toplamSayilar += sayi;
        }
        return  toplamSayilar;
    }
}
