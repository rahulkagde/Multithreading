package Multithreading_Runnable;

public class MyRunnable implements Runnable {
	
	public void run()
	{
		for(int i=1;i<100;i++)
		{
			System.out.println(i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
