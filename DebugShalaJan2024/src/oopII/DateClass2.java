package oopII;

public class DateClass2 {
	
	//Data members
	private int dd , mm , yy ;
	
	//No-args Constructor , default constructor
	
	public DateClass2()
	{
		this.dd=10;
		this.mm=10;
		this.yy=2023;
	}
	//Note: if we not specify any constructor default constructor is present.
	//Actual parameter
	public DateClass2(int date , int month , int year)
	{
		this.dd=date;
		this.mm=month;
		this.yy=year;
	}
	
	public void display()
	{
		System.out.println(dd+"-"+mm+"-"+yy);
	}
}
