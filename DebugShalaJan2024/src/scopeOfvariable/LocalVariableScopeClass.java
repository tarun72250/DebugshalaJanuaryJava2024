package scopeOfvariable;

public class LocalVariableScopeClass {
	
	public void myMethod()
	{
		int i =10;//local variable i
		System.out.println(i);//which is accesssible in only local scope
	}
	
	
	public static void main(String[] args) 
	{
		int i=10;
		System.out.println(i);
		//int i =12; through error bcoz sAME NAME 
	}
	
	//System.out.println(i); // this is printing statement which is always written in any method. 


}
