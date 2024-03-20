package treeSetDemo;

import java.util.Set;
import java.util.TreeSet;

public class A_08_Empdemo {
	public static void main(String[] args) 
	{
		Set<A_08_Emp> a_08_Emp=new TreeSet<>();
		a_08_Emp.add(new A_08_Emp(100,"tarun",20000,20));
		a_08_Emp.add(new A_08_Emp(120,"anup",35000,10));
		a_08_Emp.add(new A_08_Emp(140,"mahesh",35000,10));
		a_08_Emp.add(new A_08_Emp(80,"mayur",30000,10));
		a_08_Emp.add(new A_08_Emp(60,"prateek",15000,20));
		a_08_Emp.add(new A_08_Emp(140,"nikhil",35000,10));
		
		for(A_08_Emp e:a_08_Emp)
			System.out.println(e);
	}
}
