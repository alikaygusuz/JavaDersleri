package tasksOne;

public class ReCapDemo {

	public static void main(String[] args) {
		
		int numOne = 23;
		int numTwo = 15;
		int numThree = 29;
		int theBiggestNum = 0;
		
		if (numOne > numTwo && numOne > numThree) {
			theBiggestNum = numOne;
			System.out.println("En büyük sayı:  "  + theBiggestNum);
		} else if (numTwo > numOne && numTwo > numThree) {
			theBiggestNum = numTwo;
			System.out.println("En büyük sayı:  "  + theBiggestNum);
			
		} else {
			theBiggestNum = numThree;
			System.out.println("En büyük sayı:  "  + theBiggestNum);
			
		}
	}

}
