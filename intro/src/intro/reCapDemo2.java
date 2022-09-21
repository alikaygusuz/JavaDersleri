package intro;

public class reCapDemo2 {

	public static void main(String[] args) {

		double numbers[] = {1.2, 2.3, 4.8, 6.7, 2.5};
		double total = 0;
		double max = numbers[0];
		
		for (double maxNumber : numbers) {
			double  isItPositive = max - maxNumber;
			if (isItPositive < 0) {
				max = maxNumber;
				}

			}
		
		for (double number : numbers) {
			total = total + number;
			System.out.println(number);
		}
		
		System.out.println("Girdiğiniz sayıların toplamı:" + total);
		System.out.println("En büyük sayı= " + max);
		
	}

}
