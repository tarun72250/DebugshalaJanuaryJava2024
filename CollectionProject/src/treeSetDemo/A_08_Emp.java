package treeSetDemo;

public class A_08_Emp implements Comparable<A_08_Emp> {

	int eid;
	String name;
	int sal;
	int deptno;
	
	public A_08_Emp()
	{
		
	}
	
	public A_08_Emp(int eid,String name,int sal,int deptno)
	{
		this.eid=eid;
		this.name=name;
		this.sal=sal;
		this.deptno=deptno;
	}

	@Override
	public String toString() 
	{
		return "Emp [eid=" + eid + ", name=" + name + ", sal=" + sal + ", deptno=" + deptno + "]";
	}

	public int compare(A_08_Emp o1, A_08_Emp o2) 
	{
		int diff=o1.deptno-o2.deptno;
		
		return diff;
	}

	@Override
	public int compareTo(A_08_Emp o) 
	{
		int diff;
		diff=this.deptno-o.deptno;
		if(diff==0)
		{
			diff=this.sal-o.sal;
			if(diff==0)
			{
				diff=this.name.compareTo(o.name);
			}
		}
		return diff;
	}

	
}
