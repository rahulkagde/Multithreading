package Classs_Level_Multithreading_Synchronization;

public class Hello {
	
	//static keyword converts into class level
	public static synchronized void display(String msg) 
	{
		System.out.println("[ "+ msg +" ]");
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
