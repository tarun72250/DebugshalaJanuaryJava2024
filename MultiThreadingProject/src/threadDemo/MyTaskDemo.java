package threadDemo;

import threadClasses.MyTask;

public class MyTaskDemo {

	public static void main(String [] args)
	{
		//main Thread is existing
		//gc is existing
		//task implementation
		Runnable r =new MyTask();
		//Controller of task 
		Thread thread = new Thread(r); //object of runnable
		thread.start();
		
		for( int i=1 ; i<= 5 ; i++)
		{
			System.out.println("Main Thread Print :"+i);
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
}
