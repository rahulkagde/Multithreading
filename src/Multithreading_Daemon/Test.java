package Multithreading_Daemon;

public class Test {
	
	public static void main(String[] args) {
		
		MyRunnable mr=new MyRunnable();
		Thread t=new Thread(mr);
		
		t.setDaemon(true);
		t.start();
		
		for(int i=1;i<10;i++)
			System.out.println("main--");
		
	}

}
