package jumpStatements;

public class ReturnClass {

	public static void main(String[] args) {
		
		  boolean t = true;
	        System.out.println("Before the return.");
	 
	        if (t)
	        {
	        	System.out.println("inner scope ");
	            return;
	        }   
	        
	        
	        System.out.println("outer scope");
	         


	}

}
