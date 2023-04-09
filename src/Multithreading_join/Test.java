package Multithreading_join;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		MyRunnable mr=new MyRunnable();
		Thread t=new Thread(mr);
		
		t.start();
		
		for(int i=1; i<=10; i++)
		System.out.println("main start");
		
		//t.join(300); 
		t.join();
		for(int i=1;i<=10;i++)
			System.out.println("main end");
		
		
	}
}
