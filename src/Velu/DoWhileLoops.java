package Velu;

public class DoWhileLoops {

	public static void main(String[] args) {
		
		/*1. 1st Method */
		int a = 0;
		
		while (a <=10) {      		// First Evaluates the condition
			System.out.println(a);;  // Second Execute the statement
			a++;					
		}
		
		System.out.println("--------------------------------------");
		
		/*2. 2nd Method */
		int b = 0;
		do {
			System.out.println(b);   // First Execute the statement
			b++;
		} while (b <=10);  			// Second Evaluates the condition
		
		System.out.println("----------------------------------");
		
		/*3. 3rd Method */
		int x = 10;
		do {
			System.out.println("Value of x : " + x);
			
			x++;
		} while (x < 20);
		
		System.out.println("-------------------------");
		
		/*4. 4th Method */
		
		int y = 10;
		do {
			System.out.println("Value of y = " + y);
			y++;
			
		}while (y <=20);
	}

}
