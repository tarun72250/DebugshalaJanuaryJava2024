package setDemo;

//if i should compare myself
public class Student implements Comparable<Student>{

	private int sid;
	private String name;
	private float percent;
	private String city;
	
	//default constructor
	public Student()
	{
		
	}
	
	//parametrized constructor
	public Student(int sid,String name,float percent,String city)
	{
		this.sid=sid;
		this.name=name;
		this.percent=percent;
		this.city=city;
	}
	
	
	//to String
	public String toString()
	{
		return  "Student [sid=" + sid + ", name=" + name + ", percent=" + percent + ", city=" + city + "]";
	}
	
	public int hashCode()
	{
		int hcode=0;
		if(city.equalsIgnoreCase("pune"))
			hcode=10;
		else if(city.equalsIgnoreCase("mumbai"))
			hcode=20;
		else if(city.equalsIgnoreCase("nashik"))
			hcode=30;
		else hcode=40;
		return hcode;
	}
	
	
	@Override
	public int compareTo(Student o) 
	{
		int diff;
		diff=this.city.compareTo(o.city);
		if(diff==0)
		{
			diff=this.name.compareTo(o.name);
			if(diff==0)
				diff=this.sid=o.sid;
		}
		return diff ;
	}
	
}
