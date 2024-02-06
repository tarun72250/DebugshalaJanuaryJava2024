package oopII;

public class ComplexClass {
	
	
	//instance data member
	int real;
	int imaginary;
	
	
	//constructor - for initialize the object
	//Default constructor 
	public ComplexClass()
	{
		this.real=3;
		this.imaginary=5;
	}
	
	//Parametrized costructor
	public ComplexClass(int r , int i)
	{
		this.real=r;
		this.imaginary=i;
	}
	
	//instance member method
	public void display()
	{
		if( imaginary > 0 )
		{
			System.out.println(real+" + "+imaginary+"i");
		}
		else
		{
			System.out.println(real+" + "+(-(imaginary))+"i");
		}
	}
	
	

}
