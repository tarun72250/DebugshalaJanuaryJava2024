package debugShalaJava;

public class DateDemo {
	
	public static void main(String []args)
	{		
		
		Date d=new Date();
		d.showDate();
		
		Date d2 = new Date(11,22,2024);
		d2.showDate();
		
		Date d3 = new Date(11,22);
		d3.showDate();
		
		Date d4 = new Date(11);
		d4.showDate();
		
		
		
//		if(d==d1)//Same
//		System.out.println("Same");
//		else
//		System.out.println("diff");
//		
//		
//		
//		
//		Date d2=new Date();
//		Date d3=new Date(d2);
//		
//		if(d2==d3)//Diff
//			System.out.println("Same");
//			else
//			System.out.println("diff");
	}

}
