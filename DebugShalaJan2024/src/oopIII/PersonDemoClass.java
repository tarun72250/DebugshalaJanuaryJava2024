package oopIII;

public class PersonDemoClass {

	public static void main(String[] args) {
		
		PersonClass p = new PersonClass("Sumit",06,02,2024);
		p.display();
		
		PersonClass p1 = new PersonClass("Sumit");
		p1.display();
		
		PersonClass p2 = new PersonClass(12,12,2024);
		p2.display();
		

	}

}
