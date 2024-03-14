package office.staff;

import office.utility.ITraveller;
//public class SalesManager extends Emp implements ITraveller {
//for interface ITraveller
//	private int daysTravelled;//meaning full name always
//this cons is used for interface ITraveller
//public SalesManager(String name, int dd, int mm, int yy, int empid, float salary, int target, double incentive,int daysTravelled) {
//	super(name, dd, mm, yy, empid, salary);
//	this.target = target;
//	this.incentive = incentive;
//	this.daysTravelled=daysTravelled;
//}	
public class SalesManager extends Emp
{
	private int target;
	private double incentive;
	
	public SalesManager() {
		super();
	}
	
	public SalesManager(String name, int dd, int mm, int yy, int empid, float salary, int target, double incentive) {
		super(name, dd, mm, yy, empid, salary);
		this.target = target;
		this.incentive = incentive;
		}

	public void display()
	{
		System.out.println("Calling From SalesManager");
		super.display();//name bdate empid sallary 
		System.out.println("Extra Target : "+target);
		System.out.println("Extra Incentive : "+incentive);
	}
	
	public String toString()
	{
		System.out.println("Calling From SalesManager");
		return super.toString()+"\nExtra Target : "+target+"\nExtra Incentive : "+incentive;
	}
	
	//use protected 
		public double calSalary()
		{
			//before this code we access calSalary method like this 
			//return super.calSalary + ( super.calSalary * incentive /100);
			//but after protected we directly access salary of Emp() class like this
			return salary + ( salary * incentive /100);
		}
}


//for interface ITraveller
//@Override
//public double calculateTA() {
//	//DA * DaysTravlled//for this i need to maintain one more information d.m. daytravelled in Sm class
//	return (super.calSalary()*DA/100)*daysTravelled;
//}