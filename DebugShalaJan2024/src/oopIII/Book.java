package oopIII;

public class Book {
	
	int bookid; 		 // data members
	float price;
	
	static int count; 	//static members
	
	
	static 				//static block
	{
		count=0;
	}
	
	
	Book()  			//default constructor
	{
		count++;
		bookid=count	;
		this.price=0;
	}
	Book(float price)	//parametrized constructor
	{
		count++;
		bookid=count;
		this.price=price;
	}
	public void showDetails()		//methods
	{
		System.out.println("Book id :" +bookid+" price : "+price);
	}

}
