package threadDemo;

import threadClasses.MyJob;
import threadClasses.MyTask;

public class MyJobDemo {

	public static void main(String[] args) {
		
		MyJob j1 = new MyJob();
		j1.getT().start();; // j1 has task + controller 
		//I dont want to do that thats y I'll create controller class and do create MyJob object and use that object 
		/*MyTask t1 = new MyTask();
		Thread t=new Thread(t1);
		t.start();*/
		
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
