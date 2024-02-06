package oopII;

public class BoxDemo {
	
	public static void main(String[]args)
	{
		//calling default cons
		Box b = new Box();
		b.calVolume();
		
		//calling parametrized cons
		Box b1 = new Box(2,2,2);
		b1.calVolume();
		
		//copying state of b1 object ,
		Box b2 = b1;
		
		
		//Check refrence equality
		if(b == b1)
		System.out.println("Same");
		else
		System.out.println("Different");
		
		
		if(b1 == b2)
		System.out.println("Same");
		else
		System.out.println("Different");
	
		
	}

}
