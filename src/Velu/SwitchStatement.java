package Velu;

public class SwitchStatement {

	public static void main(String[] args) {
		
		/*
		1. Ex : 1
		int score = 100;
		// byte, short, int or char
		
		switch(score)
		{
		case 95:   // Without break
		case 100:   // Without break
		case 90 :
			System.out.println("Very good");
			break ;
		case 40 :
			System.out.println("good");
			break ;
		case 30 :
			System.out.println("OK");
			break ;
		default :
			System.out.println("Pass");
		}*/ 
		
		char grade = 'e';
		
		switch (grade) {
			
		case 'a' :
			System.out.println("Excellent");
			break;
		case 'b':
			break;
		case 'c':
			System.out.println("Well done");
			break;
		case 'd':
			System.out.println("you Passed");
		case 'e':
			System.out.println("Better");
			break;
		default :
			System.out.println("Try to imporve yourself");
		}
		
		System.out.println("Grade is : " + grade);
		
	}

}
