package threadClasses;

public class MyJob implements Runnable//1 step:-implements runnable 
{

	//2step: -declare controller of the task
	private Thread t;  // has - a relationship they maintain.
	
	public MyJob() {
		super();
		//3step create thread object of controller
		t=new Thread(this);//instance of MyJob -Runnable
	}

	//5step overridding run method
	@Override
	public void run() {
		
		for( int i=1 ; i<= 5 ; i++)
		{
			System.out.println("Child Thread Print :"+i);
			try {
				//It is static method which block method ruuning to blocked state
				  Thread.sleep(500);//running to blocked , after 500 sec,  will wake up waiting to run 
			    } 
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}

	//4.declare its public getter method 
	public Thread getT() {
		return t;
	}
	

}
