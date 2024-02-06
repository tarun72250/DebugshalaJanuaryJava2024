package oopII;

public class Box {
	
	//instance data member
	int height;
	int width;
	int depth;
	
	//default constructor
	public Box()
	{
		this.height=this.width=this.depth=0;
	}
	
	//parametrized constructor 
	public Box(int h , int w , int d)
	{
		this.height=h;
		this.width=w;
		this.depth=d;
	}
	
	//paramterized cons for copying state of another object
	public Box(Box b)
	{
		super();
		this.height=b.height;
		this.width=b.width;
		this.depth=b.depth;
	}
	
	//instance member method
	public void calVolume()
	{
		int volume= height*width*depth;
		System.out.println("volume of box: "+volume);
	}
}
