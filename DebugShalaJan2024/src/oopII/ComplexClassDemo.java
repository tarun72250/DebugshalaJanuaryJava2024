package oopII;

public class ComplexClassDemo {
	
	public static void main(String [] args)
	{
		//calling default constructor
		ComplexClass c = new ComplexClass();
		c.display();
		
		//calling paramterized cons with negative value
		ComplexClass c1 = new ComplexClass(2 , -3);
		c1.display();
	}

}
