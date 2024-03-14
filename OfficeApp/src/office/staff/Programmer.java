package office.staff;

import office.utility.ITraveller;
//public class Programmer extends Emp implements ITraveller {
//for  interface ITraveller
//private int daysTravelled;
//This cons is used for interface ITraveller
//	public Programmer(String name ,int dd , int mm , int yy, int empid , float sallary, int extraHours, int chargesPerhours, int daysTravelled)
//	{
//		super(name,dd,mm,yy,empid,sallary);
//		this.extraHours=extraHours;
//		this.chargesPerHours=chargesPerhours;
//		this.daysTravelled=daysTravelled;
//	}
public class Programmer extends Emp{

	private int extraHours;
	private int chargesPerHours;
	
	public Programmer()
	{
		
	}
	
	public Programmer(String name ,int dd , int mm , int yy, int empid , float sallary, int extraHours, int chargesPerhours)
	{
		super(name,dd,mm,yy,empid,sallary);
		this.extraHours=extraHours;
		this.chargesPerHours=chargesPerhours;
	}

	public void display()
	{
		System.out.println("Calling From Programmer");
		super.display();
		System.out.println("Extra hours : "+extraHours);
		System.out.println("Charges Per hours : "+chargesPerHours);
		
	}

	@Override
	public String toString() {
		System.out.println("Calling From Programmer");
		return super.toString() +"\nextraHours :" + extraHours + "\nchargesPerHours=" + chargesPerHours;
	}

	//use protected
	public double calSalary()
	{
		//before this code we access calSalary method like this 
		//double basic =super.calSalary();
		//return basic + (extraHours*chargesPerHours);
		//but after protected we directly access salary of Emp() class like this
		//directly salary accesible bcoz of protected in Emp() class
		double basic = salary;
		return basic + (chargesPerHours*extraHours);
	}

}


////for interface ITraveller
//@Override
//public double calculateTA() {
//	//DA * daysTravelled
//	//where this DA comes.is avaibale in interface.
//	return (super.calSalary()*DA/100)*daysTravelled;
//}	 

//for interface use
//@Override//without protected normal calSalary()
//public double calSalary() {
//	
//	double basic= super.calSalary();
//	return basic+(extraHours * chargesPerHours)+calculateTA();
//}