package polymorphismAssignment;

public class Person {

	private String name;
    private int age;
    Date bdate;

   
    public Person() {
	
	}

	public Person(String name, int age,int dd, int mm , int yy) {
		this.name = name;
		this.age = age;
		this.bdate = new Date(dd,mm,yy);
	}

	public void display() {
		bdate.showDate();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", bdate=" + bdate.toString() + "]";
	}
    
    
}
