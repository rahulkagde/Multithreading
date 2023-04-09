package Multithreading_Daemon;

public class MyRunnable implements Runnable{
	
	public void run()
	{
		for(int i=1;i<10;i++)
			System.out.println("My Runnable"+i);
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
