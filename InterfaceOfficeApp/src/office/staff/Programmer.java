package office.staff;

import office.utility.ITraveller;

public class Programmer extends Emp implements ITraveller {

	private int extraHours;
	private int chargesPerHours;
	//for  interface ITraveller
	private int daysTravelled;
	
	public Programmer()
	{
		
	}
	
	public Programmer(String name ,int dd , int mm , int yy, int empid , float sallary, int extraHours, int chargesPerhours)
	{
		super(name,dd,mm,yy,empid,sallary);
		this.extraHours=extraHours;
		this.chargesPerHours=chargesPerhours;
	}
	
	//This cons is used for interface ITraveller
	public Programmer(String name, int dd, int mm, int yy, int empid, float salary, int extraHours, int chargesPerHours,
			int daysTravelled) {
		super(name, dd, mm, yy, empid, salary);
		this.extraHours = extraHours;
		this.chargesPerHours = chargesPerHours;
		this.daysTravelled = daysTravelled;
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

	//for interface ITraveller
	@Override
	public double calculateTA() {
		//DA * daysTravelled
		//where this DA comes.is avaibale in interface.
		return (salary*DA/100)*daysTravelled;
	}
	
	//use protected
	@Override
	public double calSalary() {
		//directly salary accesible bcoz of protected in Emp() class
		return salary+(extraHours * chargesPerHours);
	}
	
}
