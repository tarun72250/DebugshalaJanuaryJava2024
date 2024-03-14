package office.staff;

import office.utility.ITraveller;

public class SalesManager extends Emp implements ITraveller {

	private int target;
	private double incentive;
	//for interface ITraveller
	private int daysTravelled;//meaning full name always
	
	public SalesManager() {
		super();
	}
	
	public SalesManager(String name, int dd, int mm, int yy, int empid, float salary, int target, double incentive) {
		super(name, dd, mm, yy, empid, salary);
		this.target = target;
		this.incentive = incentive;
		}
	
	//this cons is used for interface ITraveller
	public SalesManager(String name, int dd, int mm, int yy, int empid, float salary, int target, double incentive,int daysTravelled) {
		super(name, dd, mm, yy, empid, salary);
		this.target = target;
		this.incentive = incentive;
		this.daysTravelled=daysTravelled;
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
	
	//for interface ITraveller
	@Override
	public double calculateTA() {
		//DA * DaysTravlled//for this i need to maintain one more information d.m. daytravelled in Sm class
		return (salary*DA/100)*daysTravelled;
	}
	
	
	//use protected 
	@Override
	public double calSalary() {
		//directly salary accesible bcoz of protected in Emp() class
		return salary + (salary*incentive/100);
	}
	
}
