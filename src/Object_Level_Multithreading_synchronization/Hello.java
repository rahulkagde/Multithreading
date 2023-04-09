package Object_Level_Multithreading_synchronization;

public class Hello {
	
	public synchronized void display(String msg)
	{
		System.out.println("[ "+ msg+" ]");
	}

}
