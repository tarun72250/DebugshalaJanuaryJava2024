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
	
	
		//@Override // we can't use this @Override keyword here because we can't override the calSalary() we directly access these sallary because of protected dm access in subclasses.
		public double calSalary()
		{
				// normal calSalary() for access the salary,
				//return super.calSalary()+bonus;
				//but after declare salary protected dm we access salary direclty like this
				return salary+bonus;
		}	
}

