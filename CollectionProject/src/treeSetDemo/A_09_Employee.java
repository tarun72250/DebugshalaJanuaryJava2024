package treeSetDemo;

public class A_09_Employee implements  Comparable<A_09_Employee>
//public class Employee implements Comparator<Employee>

{
	int eid;
	String name;
	int sal;
	
	
	public A_09_Employee() 
	{
		super();
	}


	public A_09_Employee(int eid, String name, int sal) 
	{
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(A_09_Employee o) {
		
		int diff=this.sal-o.sal;
		return diff;
	}
	
	
	
	
	
	
	
}