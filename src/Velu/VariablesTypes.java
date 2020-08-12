package Velu;

public class VariablesTypes {
	
	/* Types of Variables
	1. Local Variables
	2. Instance Variables
	3. Static Variables*/
		
	/*1. Local Variables*/
	
//		public static void main (String[] args) {
//			
//			int a = 10;
//			int b = 50;
//			int c = a+b;
//			System.out.println("Sum of a and b is " + c);
//		}
	
	/*2. Instance Variables */
	int c;	
	public void addition() {
		int a = 10;
		int b = 20;
		c = a+b;
		System.out.println("Sum of a and b is : "+c);
		}
	
	public void difference () {
		
		int x = 100;
		int y = 150;
		c = x - y;
		System.out.println("Difference between a and b is " + c);
				
	}
	
	public static void main(String[] args) {
		
		VariablesTypes types = new VariablesTypes();
		types.addition();
		types.difference();
		
	}
	
	
}
