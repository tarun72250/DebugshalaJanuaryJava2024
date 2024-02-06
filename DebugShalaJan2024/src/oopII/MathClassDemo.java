package oopII;

public class MathClassDemo {
	
	public static void main(String[]args)
	{
		MathClass m; //refrence variable 
		int n ;// insance variable 
		
		System.out.println("\n1 Object Calling :");
		m = new MathClass();
		m.addOfTwoInteger(2,3);
		
		System.out.println("\n2 Object Calling :");
		MathClass m1 = new MathClass();
		m1.addOfThreeInteger(2,3,4);
		
		System.out.println("\n3 Object Calling :");
		MathClass m3 = new MathClass();
		m3.addOfTwoFloat(2.3f,3.2f);
		
		System.out.println("\n4 Object Calling :");
		MathClass m4 = new MathClass();
		m4.addOfIntFloatDouble(2,3.2f,3.9);
		
	}

}
