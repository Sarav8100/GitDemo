package Msd;

import java.util.Scanner;

public class GettingUseInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter some number");
		int user_input_number = scan.nextInt();
		
		System.out.println("The Entered value is");
		System.out.println(user_input_number);
		
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Enter some decimal value");
		double user_input_double = scan1.nextDouble();
		
		System.out.println("The Entered value is");
		System.out.println(user_input_double);
		
		
		
		
		
	}

}
