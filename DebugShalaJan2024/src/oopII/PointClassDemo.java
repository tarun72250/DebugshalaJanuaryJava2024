package oopII;

public class PointClassDemo {
	
	public static void main(String[]args)
	{
	    // by default in class default constructor is present which have value 00	
		//in our class if we specify any other constructor ,or we calling default cons,
		// default cons specification is compulsory.
		PointCLass p =new PointCLass();
		p.display();
		
		//calling parametrized cons
		PointCLass p1 =new PointCLass(10,20);
		p1.display();
	}

}
