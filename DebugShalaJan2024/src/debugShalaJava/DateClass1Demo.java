package debugShalaJava;

public class DateClass1Demo {
	
	public static void main(String[]args)
	{
		//default cons
		DateClass1 d= new DateClass1();
		d.showDate();
		
		//fully para cons
		DateClass1 d1= new DateClass1(12,10,2023);
		d1.showDate();
		
		//partially parameterized cons
		DateClass1 d2= new DateClass1(12,10);
		d2.showDate();
	
		//refrence cons
		DateClass1 d3= new DateClass1(d2);
		d3.showDate();
		
		DateClass1 d4= d2;
		d4.showDate();
		
		if(d2==d3)
			System.out.println("Same");
		else
			System.out.println("Different");

		if(d2==d4)
			System.out.println("Same");
		else
			System.out.println("Different");
	
	}

}
