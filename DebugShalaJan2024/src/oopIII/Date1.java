package oopIII;

public class Date1 {
	
	private int dd; // data members
	private int mm;
	private int yy;
	int a;
	static int count; //static data members
	static // static block
	{
		count=0;
	}
	public Date1() //default constructor
	{
		count++;
		a=count;
		dd=1;
		mm=1;
		yy=1970;
	}
	public Date1(int dd,int mm,int yy) // parametrized constructor
	{
		count++;
		a=count;
		this.dd=dd;
		mm=mm;
		this.yy=yy;
	}
	
	public Date1(Date d) // para constructor
	{
		count++;
		a=count;
		this.dd=d.dd;
		this.mm=d.mm;
		this.yy=d.yy;
		
	}
	public void showDate(char ch) // method
	{
		System.out.println(dd+""+ch+mm+""+ch+yy);
	}
	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	public boolean isLeapYear()
	{
		if(yy%4==0 && yy%100 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}

	}

}
