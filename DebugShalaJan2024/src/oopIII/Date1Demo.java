package oopIII;

public class Date1Demo {

	public static void main(String[] args) {
		Date d1=new Date();
		d1.showDate();
		Date d2=new Date(22,4,1999);
		Date d3=new Date(d2);
		d2.showDate();
		d2.isLeapYear();
		d2.showDate('-');
		d3.showDate();
		d3.isLeapYear();
		if(d2.isLeapYear())
			System.out.println("Leap year");
		else
			System.out.println("Not Leap year");

	}

}
