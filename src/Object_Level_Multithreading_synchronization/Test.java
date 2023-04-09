package Object_Level_Multithreading_synchronization;

public class Test {
	
	public static void main(String[] args) {
		
		Hello h=new Hello();
		
		A t1=new A(h,"Java");
		A t2=new A(h,"CJC");
		
		t1.start();
		t2.start();
		
		Hello h1=new Hello();
		
		A t3=new A(h1,"Akurdi");
		A t4=new A(h1,"classes");
		
		t3.start();
		t4.start();
		
		//Object based synchronization

		}
}
