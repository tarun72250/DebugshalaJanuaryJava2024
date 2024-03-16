package threadClasses;

public class DefaultThreadDemo {

	public static void main(String[] args)
	{
		//One Thread will not create Automatically it call by main method and create .
		//Run time environment will calling the main method automatically create the thread. 
		// Thread.currentThread(); will use anywhere for access the current thread
		Thread t = Thread.currentThread();
		System.out.println("Name : "+t.getName());
		System.out.println("Priority : "+t.getPriority());
		//Priority - number btw 1(low) to 10(high)
		//by default set to mind priority
		//Thread may get a chance to run early.
		
		t.setName("Appln Thread");
		//t.setPriority(8);
		//t.setPriority(Thread.MAX_PRIORITY);//10
		//t.setPriority(Thread.MIN_PRIORITY);//1
		t.setPriority(Thread.NORM_PRIORITY);//5
		System.out.println("After Modification : ");
		System.out.println("Name : "+t.getName());
		System.out.println("Priority : "+t.getPriority());
		
	
	}

}
