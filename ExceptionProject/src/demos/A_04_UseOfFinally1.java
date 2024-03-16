package demos;

public class A_04_UseOfFinally1 {

	public static void main(String[] args) {
		try 
		{
			//open the file
			//read the content from file
			//close the file
			System.out.println("In Try block...!");
			int n1 = Integer.parseInt("Hello");
			//only one condition there were finally not gets executed
			System.exit(0);//program has been terminated forcefully , only scenario the finally block get not executed
			//System.out.println("Last statement in try block....!");
		  //return;//if u have return stmt finaly gets executed.

		}
		catch(Exception e)//catch block is executed if there is execption but finally block get executed even if there is execption or not
		{
			//e.printStackTrace();
			System.out.println("in catch block");
		}
		//we written that in finally block seen in next demo
		finally //finally block will always get executed even if there is execption or not
		{
			//purpose finaly block get close the resources which are opened in try block
			System.out.println("In Finally block");
		}
	}

}