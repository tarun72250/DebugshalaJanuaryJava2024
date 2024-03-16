package threadDemo;

import threadClasses.MyThread;

public class MyThreadDemo {

	public static void main(String[] args) {
	
		MyThread t = new MyThread();//newly created
		t.start();//ready to run	
		
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
//Is the sequnce different
//two thread may get completing their task
// how the thread to be created and executing
//when u dont use start() cant go to run mehtod.
//two thread are created and two are started u cant start main thread and cant created the main thread.

