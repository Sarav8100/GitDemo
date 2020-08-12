package Velu;

public class ForLoops {

	public static void main(String[] args) {
		
		int [] myintarray = {100,31,26,48,52};
		
		/*int index = 0;
		while (index <5) {
			
		}
		System.out.println(myintarray[index]);
		index++;
		*/
					
		/*1. 1st Method*/
		for (int index=0; index <5 ; index++)         /*initialization; expession; increment;*/ 
		{
			System.out.println(myintarray[index]);
		}
		
		/*2. 2nd Method*/
		for (int element : myintarray)					
		{
			System.out.println(element);
		}

		/*3. 3rd Method*/
		
		for(int x = 10; x <=20;  x++) {
			
			System.out.println(x);
			System.out.println("\n");
		}
		
		
	}

}
