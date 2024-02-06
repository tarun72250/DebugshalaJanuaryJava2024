package oopII;

public class DateClassDemo {
	
	public static void main(String []args)
	{
		DateClass d;    //refrence variable
		
		d=new DateClass(12,12,2023);   //alocating memory on heap
		d.showDate();
		
		
		DateClass d1=new DateClass(31,01,2023);
		d1.showDate();
		
	}

}
