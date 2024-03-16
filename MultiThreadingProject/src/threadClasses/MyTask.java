package threadClasses;

public class MyTask implements Runnable {

	@Override
	public void run() {
		//task definition
		//subclass overrideen method cannot throw extra checked exception
		
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

}
