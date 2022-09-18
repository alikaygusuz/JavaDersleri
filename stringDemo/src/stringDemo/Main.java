package stringDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		
		System.out.println("Eleman sayısı = " + mesaj.length());
		System.out.println("8.eleman = " + mesaj.charAt(7));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("B"));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.lastIndexOf("e"));
		
		
		String yenimesaj = mesaj.replace(' ', '-');
        System.out.println(yenimesaj);
        System.out.println(yenimesaj.substring(2,4));

        for( String kelime: mesaj.split(" ")){
            System.out.println(kelime);
        }

        //bastaki ve sondaki boslukları almak icin trim fonk kullanılır
        System.out.println(mesaj.trim());
	}

}
