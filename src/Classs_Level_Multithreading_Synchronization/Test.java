package Classs_Level_Multithreading_Synchronization;

public class Test {
	
	public static void main(String[] args) {
		
		Hello h=new Hello();
		
		A t1=new A(h, "CJC");
		A t2=new A(h, "Java");
		
		t1.start();
		t2.start();
		
		Hello h1=new Hello();
		
		A t3=new A(h1,"Akurdi");
		A t4=new A(h1,"classes");
		
		t3.start();
		t4.start();
		
	}

}
