package intro;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//değiken isimlendirmeleri java'da camelcase yazılır.
		String ortaMetin = "İlginizi çekebilir.";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		System.out.println(altMetin );
		

		double dolarDun = 18.15;
		double dolarBugun = 18.10;
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarDun == dolarBugun) {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
	}

}
 