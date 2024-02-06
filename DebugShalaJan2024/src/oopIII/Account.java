package oopIII;

public class Account {
	

	   //instance - non-static data members
	   private int accno;
	   private float balance;
	   //static data member	
	   private static float int_rate; 
	    
	   //static block 
	   static
	   {
		System.out.println("in static block");
		int_rate = 4.5f;
	   }

	   //default constructor
	   public Account()
	   {
		   this.accno=1002;
		   this.balance=2000;
	   }

	   //parametrized constructor
	   public Account(int accno, float balance)
	   {
		this.accno = accno;
		this.balance = balance;
	   }

	   
	   //static method which is called directly by class name
	   public static void updateRate(float nrate)
	   {
		int_rate = nrate;
		//this.balance = 14000.00f;   //not allowed to access non-static
	   }

	   //static method to access this class static method value
	   public static float getIntRate()
	   {
		return int_rate;
	   }		

	   //no static method which is called by creating object
	   public double calBalance()
	   {
		return balance+(balance*int_rate/100);
	   }	

}
