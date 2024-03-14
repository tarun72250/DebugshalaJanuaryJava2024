package office.staff;

import office.utility.Person;

//something which is not completely defined
//abstract keyword we cant use new keyword
//can't create object of abstract class 
//public abstract class Emp extends Person {
public class Emp extends Person{
	private int empid;//extra dm for EMp
	//private float salary;
	protected float salary;
	
	
	public Emp() {
		super();
	}


	public Emp(String name, int dd, int mm, int yy, int empid, float salary) {
		super(name, dd, mm, yy);
		this.empid = empid;
		this.salary = salary;
	}


	public void display()
	{
		//this.display();//infinite recursion
		//but i want to call person display
		super.display();
		System.out.println("Empid :"+empid);
		System.out.println("Salary :"+salary);
	}


	@Override
	public String toString() {
		
		return super.toString()+" "+"Emp [empid=" + empid + ", salary=" + salary + "]";
	}

	public  double calSalary()
	{
		return salary;
	}
	//public abstract double calSalary();
}
