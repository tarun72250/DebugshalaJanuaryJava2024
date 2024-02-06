package debugShalaJava;

public class DateClass1 {
	
	int dd;   //data member 
	int mm;   //class data member
	int yy;   //instance data member
	
	//No-args constructor, by-default present
	public DateClass1()
	{
		this.dd=10;
		this.mm=10;
		this.yy=2023;
	}
	

	//Fully parametrized sConstructor
	public DateClass1(int date , int month , int year)
	{
		this.dd=date;
		this.mm=month;
		this.yy=year;
	}
	
	
	//parametrized constrcutor
	public DateClass1(int dd, int mm)
	{
		this.dd=dd;
		this.mm=mm;
	}
	
	
	//member method , member functions , intance member method(behaviour)
	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
}
