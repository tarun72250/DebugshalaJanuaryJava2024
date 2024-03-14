package polymorphismAssignment;

public class Date {

	private int dd; // data members
	private int mm;
	private int yy;
	

	public Date() //default constructor
	{
		
	}
	public Date(int dd,int mm,int yy) // parametrized constructor
	{
		
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public Date(Date d) // para constructor
	{
		this.dd=d.dd;
		this.mm=d.mm;
		this.yy=d.yy;	
	}
	
	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	
	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
}
