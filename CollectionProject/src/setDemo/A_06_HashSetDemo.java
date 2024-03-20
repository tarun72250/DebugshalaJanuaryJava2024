package setDemo;

import java.util.HashSet;
import java.util.Set;

public class A_06_HashSetDemo 
{
	public static void main(String[] args) 
	{
		Set<Student> students=new HashSet<>();
		
		students.add(new Student(99,"tarun",87.98f,"bhopal"));
		students.add(new Student(67,"anup",95.8f,"kolhapur"));
		students.add(new Student(111,"neha",69.8f,"mumbai"));
		students.add(new Student(123,"deepak",79.4f,"nashik"));
		students.add(new Student(57,"mahesh",92.4f,"nagpur"));
		students.add(new Student(145,"prashant",87.6f,"pune"));
		students.add(new Student(167,"vikas",73.8f,"nagpur"));
		students.add(new Student(189,"rajesh",91.0f,"pune"));
		students.add(new Student(174,"sonal",69.4f,"pune"));
		students.add(new Student(172,"sneha",81.8f,"nashik"));
		students.add(new Student(172,"sneha",81.8f,"nashik"));
		students.add(new Student(112,"vilas",55.8f,"pune"));
		students.add(new Student(116,"neeraj",92.4f,"nagpur"));
		
		for(Student s:students)
			System.out.println(s);
	}
}
