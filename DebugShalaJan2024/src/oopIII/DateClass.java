package oopIII;

public class DateClass {
	
	//instance data member
	int dd,mm,yy;
	
	//Default cons
	public DateClass()
	{
		
	}
	
	//Paramterized cons
	public DateClass(int d , int m , int y)
	{
		this.dd=d;
		this.mm=m;
		this.yy=y;
	}
	
	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	

}
