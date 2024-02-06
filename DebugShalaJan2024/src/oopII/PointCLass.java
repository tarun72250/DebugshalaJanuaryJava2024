package oopII;

public class PointCLass {
	
	//instance data member 
	int x;
	int y;
	
	public PointCLass()
	{
		this.x=0;
		this.y=0;
	}
	//parametrized constructor
	public PointCLass(int x , int y)
	{
		this.x=x;
		this.y=y;
	}
	
	//instance member method
	public void display()
	{
		System.out.println("["+x+","+y+"]");
	}

	
}
