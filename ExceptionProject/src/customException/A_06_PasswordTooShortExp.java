package customException;

public class A_06_PasswordTooShortExp extends Exception{
    
	String msg="Password too short";
	
	public A_06_PasswordTooShortExp() {
		msg="Password to short";
	}
	
	public String getMessage() {
		return msg;
	}
	
	public String toString() {
		return msg;
	}
}
