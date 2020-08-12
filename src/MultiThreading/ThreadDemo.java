package MultiThreading;

class Hi extends Thread
{
	public void run()
	{
		for (int i=1; i<=5; i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(500);} catch (Exception e) {}
		}
	}
}

class Hello extends Thread
{
	public void run() 
	{
		for (int i=1; i<=5; i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(500);} catch (Exception e) {}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		Thread t1 = new Thread();
		Thread t2= new Thread();
		
		t1.start();
		try { Thread.sleep(10);} catch (Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		
	}

}
