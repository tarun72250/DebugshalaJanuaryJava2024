package inheritanceAssignment;

public class EmpDemo {

	public static void main(String[] args) {
		 /*// Creating a Person object
        Person person = new Person("Amit", 30);
        System.out.println("Displaying Person information only using Person clas :");
        person.display();
        System.out.println();

        // Creating an Emp (Employee) object
        Emp emp = new Emp("Sumit", 25, 1001, 50000.0);
        System.out.println("Displaying Employee information :");
       // emp.display();
        System.out.println();
        System.out.println( emp.toString());
        
        System.out.println("\nCalling default cons");
        Emp e =new Emp();
        e.display();*/
        
        
        System.out.println("\nDisplaying Employee as a Person");
        //Super class refrence refers to to subclass obj
        //empAsPerson called as generic refrence. 
        Person empAsPerson = new Emp("Ishan", 25, 1001, 50000.0);
        //sub class refrence can not refer to super class obj.
        //Emp e = new Person();//not possible 
        // Call display method
       System.out.println( empAsPerson.toString());//dynamic binding , calls method from obj
       
        // Check whether display method gets called from Person or Emp
        // Since display() is overridden in Emp class, it will call the display() method of Emp class
        // even though the reference is of Person type
	}

}
