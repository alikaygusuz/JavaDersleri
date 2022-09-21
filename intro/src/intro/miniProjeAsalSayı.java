package intro;

public class miniProjeAsalSayı {

	public static void main(String[] args) {
		int number = 23;
        //System.out.println(remainder);
        boolean isPrime = true;

        if (number==1) {
            System.out.println(number + " bir Asal sayı değildir. ");
            return;
        }

        if (number<1) {
            System.out.println(" Geçersiz Sayi ");
            return;
        }

        for (int i=2; i<number;i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(number + " bir Asal sayıdır. ");
        } else  {
            System.out.println(number + " bir Asal sayı değildir. ");
        }
	}

}
