package office.staff;

public class Admin extends Emp {
	
	private double bonus;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, int dd, int mm, int yy, int empid, float salary,double bonus) {
		super(name, dd, mm, yy, empid, salary);
		// TODO Auto-generated constructor stub
		this.bonus=bonus;
	}

	@Override
	public void display() {
		System.out.println("Calling From Admin");
		super.display();
		System.out.println("Bonus :"+bonus);
	}

	@Override
	public String toString() {
		System.out.println("Calling From Admin");
		return super.toString()+"\nBonus : "+bonus;
	}
	
	//use protected 
	public double calSalary() {
		//directly salary accesible bcoz of protected in Emp() class
		return salary + bonus;
	}
	
}
