package polymorphismAssignment;

public class Emp extends Person {

	private  int empid;
	private double salary;
	
	public Emp()
	{
		this.empid=0;
		this.salary=0;
	}

    Emp(String name, int age,int dd, int mm , int yy, int empid, double salary) {
        super(name, age, dd, mm, yy);//this super will becomes 1st
        this.empid = empid;
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + empid);
        System.out.println("Salary: $" + salary);
    }

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Emp [empid=" + empid + ", salary=" + salary + "]";
	}
}
