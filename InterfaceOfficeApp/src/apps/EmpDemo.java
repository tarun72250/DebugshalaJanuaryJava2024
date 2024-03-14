package apps;

import office.staff.Emp;
import office.utility.Person;

public class EmpDemo {

	public static void main(String[] args) {

		/*Emp e = new Emp();//why error bcoz emp is not in same package , so import statement is compulsory.
		e.display();
		
		Emp e1 = new Emp("tarun",12,12,12,12,12.2f);
		e1.display();*/
		
		//superclass refrence refers to sub class object
		//p is called as generic refrence
		Person p = new Emp("tarun",12,12,12,12,12000.2f);
		//Emp e = new Person();// this is not allowed subclass refrence cannot refers to super class object
		//p.display();//dynamic binding -calls method from object Emp();
		//Now comment Emp().display and seen has any error - no error -
		//superclass me method hona chahiye 
		//now Person().display comment and seen 
		
		//System.out.println(p);//p.toString(); i will print object , internally it will always present
		System.out.println(p.toString());//is this method available at compilation time
		//subclass want to not happy with the method implementation 
		//so subclass implement according to own , that toString()which is provide by Object class super class of all classes.
		//implement toString() in Person class 
		System.out.println("*************************");
		System.out.println(p);
		
		
		//Here what we add 
		//adding some extra state and functionality 
	
		//fn signature  is same , it include paramters also
		//But their behavour is different, method implementation is different
		//In Person class different implementattion of display and Emp class different implementation of display
		//if I remove Emp display method see the output
		//It will it will call display method from super class of Person
	}

}
