package demos;

public class A_01_TryCatchDemo {

	public static void main(String[] args) {

		try 
		{
			int n1= Integer.parseInt((args[0]));
			int n2= Integer.parseInt((args[1]));
			System.out.println("Division :"+(n1/n2));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println("Exception check again");
		}
//		catch(NumberFormatException e)
//		{
//		//	e.printStackTrace();
//		//	System.out.println(e.getMessage());
//		//	System.out.println(e);
//			//custom message
//		System.out.println("U Divide a string with integer value ");
//		}
//		catch(NullPointerException e1)
//		{
//			System.out.println("provide 2 int value");
//		}
//		catch(ArithmeticException e2)
//		{
//			System.out.println("Divide by 0");
//		}
//		catch(ArrayIndexOutOfBoundsException e3)
//		{
//			System.out.println("Acess that value which is not given");
//		}
		
	}

}
//try
//{
//int n1 = Integer.parseInt(args[0]);
//
//int n2 = Integer.parseInt(args[1]);
//unchecked exception handle is optional 
//System.out.println("Division : "+(n1/n2));
//}
//try block should be followed by finally or catch block
//handle multiple exception
//catch block gets executed when there is exception
//catch(Exception e)//Genralized catch block which can handle all type of exception 
//{
//	//System.out.println("Some error");//this is customized msg
//	//System.out.println(e.getMessage());//msg associated in exception class 
//	e.printStackTrace();//info print 
//}