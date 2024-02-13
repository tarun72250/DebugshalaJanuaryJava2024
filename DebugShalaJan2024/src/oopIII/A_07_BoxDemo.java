package oopIII;

public class A_07_BoxDemo {
	
	public static void main(String[]args)
	{
		
		 Date [] datearr;
	     datearr = new Date[3];//initialized of date array
	     datearr [0] = new Date();//deafult cons calling
	     datearr [1] = new Date(12,11,2024);//deafult cons calling
	     datearr [2] = new Date(11,11,2022);//deafult cons calling
		 for(int i=0 ; i<datearr.length ; i++)
		 {
			datearr[i].showDate();
		 }
		//calling default cons
		A_07_Box b [] ;
		b = new A_07_Box[3];
		b [0] = new A_07_Box();
		b [1] = new A_07_Box(2,3,4);
		b [2] = new A_07_Box(1,4,5);
		for(int i=0 ; i<b.length ; i++)
		 {
			b[i].calVolume();
		 }
		
		//calling parametrized cons
		A_07_Box b1 = new A_07_Box(2,2,2);
		b1.calVolume();
		
		//copying state of b1 object ,
		A_07_Box b2 = b1;
		
		
		//Check refrence equality
		if(b2 == b1)
		System.out.println("Same");
		else
		System.out.println("Different");
		
	}

}
