package With_Multithreading;

public class NumberG extends Thread{
	
	int st;
	int end;
	
	public NumberG(int st, int end) {
		super();
		this.st = st;
		this.end = end;
	}
	
	public void run()
	{
		for(int i=st;i<end;i++)
		{
			System.out.println(i);
			i++;
			
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	

}
