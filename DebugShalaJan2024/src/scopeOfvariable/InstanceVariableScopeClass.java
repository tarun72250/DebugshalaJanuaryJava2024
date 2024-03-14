package scopeOfvariable;

public class InstanceVariableScopeClass {

	int dd; // instance variable , data member of class , state , 
	
	public void showDD()
	{
		System.out.println(dd);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		InstanceVariableScopeClass i = new InstanceVariableScopeClass();
		i.showDD();
	}

}
