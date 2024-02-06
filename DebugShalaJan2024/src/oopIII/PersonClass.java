package oopIII;

public class PersonClass {
	
	String name;       //instance variable
	DateClass bdate;   // refrence variable
	
	public PersonClass()
	{
	
	}
	
	public PersonClass(String n ,int d , int m , int y )
	{
		this.name=n;
		this.bdate=new DateClass(d,m,y);
	}
	
	public PersonClass(String n)
	{
		this.name=n;
	}
	
	public PersonClass(int d , int m , int y)
	{
		this.bdate=new DateClass(d,m,y);
	}
	
	public void display()
	{
		System.out.println("Name :"+name);
		if(bdate != null)
		{
			System.out.println("Birthdate :");
				bdate.showDate();
		}
		else
		{
			System.out.println("user does not provide date info");
		}
					
	}

}
