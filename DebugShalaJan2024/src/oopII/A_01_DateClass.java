package oopII;
//Access specifier ,Class is a keyword , Class_Name
public class A_01_DateClass {

	int dd;   //Data members
	int mm;   //Data members
	int yy;   //Data members
	
	//Constructor
	public A_01_DateClass(int dd, int mm ,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void showDate()
	{
		System.out.println(dd+":"+mm+":"+yy);
	}	
}