package intro;

public class switchCase {

	public static void main(String[] args) {
		char Grade = 'A';
		switch (Grade) {
		
		case 'A':
			System.out.println("Mükemmel: geçtiniz.");
			break;
		case 'B':
			System.out.println("Çok iyi: geçtiniz.");
			break;
		case 'C':
			System.out.println("İyi: geçtiniz.");
			break;
		case 'D':
			System.out.println("Eh işte: geçtiniz.");
			break;
		case 'F':
			System.out.println("Çok kötü: kaldınız.");
			break;

		default:
			System.out.println("Lütfen geçerli bir not giriniz.");
			break;
		}
	}

}
