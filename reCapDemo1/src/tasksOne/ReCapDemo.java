package tasksOne;

public class ReCapDemo {

	public static void main(String[] args) {
		
		int numOne = 20;
		int numTwo = 21;
		int numThree = 20;
		int theBiggestNum = 0;
		
		if (numOne > numTwo && numOne > numThree) {
			theBiggestNum = numOne;
			System.out.println("En büyük sayı:  "  + theBiggestNum);
		} else if (numTwo > numOne && numTwo > numThree) {
			theBiggestNum = numTwo;
			System.out.println("En büyük sayı:  "  + theBiggestNum);
			
		} else if(numThree > numOne && numThree > numTwo) {
			theBiggestNum = numThree;
			System.out.println("En büyük sayı:  "  + theBiggestNum);
			
		}else {
			System.out.println("Bütün sayılar eşittir.");
		}
	}

}
