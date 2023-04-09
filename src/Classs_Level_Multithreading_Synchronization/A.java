package Classs_Level_Multithreading_Synchronization;

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
	}

}
