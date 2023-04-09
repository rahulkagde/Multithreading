package With_Multithreading_thread_showing;

public class Test_Priorityset {
	
	public static void main(String[] args) {
		
		NumberG odd=new NumberG(1, 100);
		NumberG even=new NumberG(2, 100);
		
	//	odd.setName("Odd");
	//	even.setName("Even");
			
		odd.start();
		even.start();

	odd.setPriority(1);
	even.setPriority(2);
		
	//	odd.start(); Don't repeat same thread, it will give exception error
		
	//-------------	
	//It will become single thread	
	//	odd.run(); 
	//	even.run();
	//------------	
		
	int a=odd.getPriority();
	int v=even.getPriority();
	
	System.out.println(a);
	System.out.println(v);
		
	
	}

}
