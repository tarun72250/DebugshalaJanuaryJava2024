package asfiyaSolvedAssignment;

public class Person {
	String name;
	Date bdate;
	
	public Person() {
		this.name = "not assigned";
		this.bdate= new Date();
		
		
	}
    
	public Person(String name,int dd, int mm, int yy) {
	bdate = new Date(dd, mm, yy);
	this.name = name;	
    }
    
	public void display() {
		bdate.showDate();
		System.out.println("name " + name);
	}
//	public static void main(String[] args) {
//		
//		Person p = new Person();
//		p.display();
//		
//	}
    }
