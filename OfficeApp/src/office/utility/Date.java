package office.utility;
public class Date {

	//data members
	   //created on heap - 0/0.0/false/'\0000'
	    int dd;   
	    int mm;
	    int yy;
	   //private boolean leapYear;

	   //no-arg or default constructor
	   public Date()
	   {
		dd=0;
		mm=0;
		yy=0;
	   }	
	   
	//parameterised construtors		
	   public Date(int dd,int mm,int yy)
	   {
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	   } 
	   //member methods
	   public void showDate()
	   {
		System.out.println(dd+"/"+mm+"/"+yy);
	   }

	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	   
	   
}
