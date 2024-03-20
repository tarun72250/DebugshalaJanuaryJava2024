package treeSetDemo;

import java.util.Set;
import java.util.TreeSet;

public class A_09_Employeedemo {

	public static void main(String[] args)
	{
//		Set<Employee>emp=new TreeSet<Employee> ();
//		

			
		Set<A_09_Employee> emp=new TreeSet<>
		(
		(A_09_Employee o1, A_09_Employee o2)->
			{
				int diff;
				diff=o2.sal-o1.sal;
					if(diff==0) 
					{
						diff=o1.name.compareTo(o2.name);
					}
				return diff;
			}
		);
		emp.add(new A_09_Employee(99,"tarun",2000));
		emp.add(new A_09_Employee(100,"anup",2000));
		emp.add(new A_09_Employee(12,"mahesh",35000));
		emp.add(new A_09_Employee(100,"mayur",35000));
		emp.add(new A_09_Employee(98,"prateek",35000));
		emp.add(new A_09_Employee(120,"nikhil",4000));
		
		for(A_09_Employee e:emp)
			System.out.println(e);
		
}
}
