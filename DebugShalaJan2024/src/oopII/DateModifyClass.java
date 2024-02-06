package oopII;

public class DateModifyClass {
	int dd;   //Data members
	int mm;   //Data members
	int yy;   //Data members
	
	//Constructor
	public DateModifyClass(int dd, int mm ,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	public void showModifyDate(char ch)
	{
		System.out.println(dd+""+ch+mm+""+ch+yy);
	}

}
