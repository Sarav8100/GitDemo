package Msd;

public class Sara {

	public static void main(String[] args) {
		
		Student Mark = new Student ();
		
		Mark.setId(1);
		Mark.setName("Mark");
		Mark.setAge(12);
		
		System.out.println(Mark.getName()+ " is " + Mark.age + " years old");
		
		Student Tom = new Student (); 
		
		Tom.setId(2);
		Tom.setName("Mark");
		Tom.setAge(15);
		
		System.out.println(Tom.getName() + " is " + Tom.getAge()+ " years old");
		
	
	}

}
