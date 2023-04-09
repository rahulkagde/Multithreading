package Multithreading_join;

public class MyRunnable implements Runnable {
	
	public void run()
	{
		for(int i=1;i<=20;i++)
			System.out.println("MyRunnable -"+i);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
