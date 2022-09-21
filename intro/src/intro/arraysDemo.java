package intro;

public class arraysDemo {

	public static void main(String[] args) {
		//Creating array.
				String[] students = new String[4];
				
				//Create elements of array.
				students[0] = "Ali";
				students[1] = "Buğra";
				students[2] = "Ayze";
				students[3] = "Nil";
				
				//Printing array elements via for loop method 1.
				for (int i = 0; i < students.length; i++) {
					System.out.println(students[i]);
					
				}
				
				//Divider of two different for loop.
				System.out.println("----------------------------------------");
				
				//Printing array elements via for loop method 2.
				for (String student : students) {
					System.out.println(student);
					
				}
	}

}
