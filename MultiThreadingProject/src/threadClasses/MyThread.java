package threadClasses;


public class MyThread extends Thread {

	//task definition
	//subclass overrideen method cannot throw extra checked exception
	//@Override
	// run() is overridden method so we not use throws Keyword.
	public void run()// we will handle in method as well using try  catch
	{
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
