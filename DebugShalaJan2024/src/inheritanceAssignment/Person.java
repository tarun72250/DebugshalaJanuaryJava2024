package inheritanceAssignment;

public class Person {

	private String name;
    private int age;

    public Person()
    {
    	name="not assigned";
    	age=0;
    }
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    // for doctor class this method is create
    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}
