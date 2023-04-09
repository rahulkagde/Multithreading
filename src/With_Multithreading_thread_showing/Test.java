package With_Multithreading_thread_showing;

public class Test {
	
public static void main(String[] args) {
		
		NumberG odd=new NumberG(1, 100);
		NumberG even=new NumberG(2, 100);
		
		odd.setName("Odd");
		even.setName("Even");
			
		odd.start();
		even.start();
		
	//	odd.start(); Don't repeat same thread, it will give exception error
		
	//-------------	
	//It will become single thread	
	//	odd.run(); 
	//	even.run();
	//------------	

	
}
}