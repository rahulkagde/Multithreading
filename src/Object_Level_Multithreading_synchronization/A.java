package Object_Level_Multithreading_synchronization;

public class A extends Thread{
	Hello h;
	String msg;
	
	public A(Hello h, String msg) {
		super();
		this.h = h;
		this.msg = msg;
	}
	
	public void run()
	{
		h.display(msg);
		
		try {
			sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
