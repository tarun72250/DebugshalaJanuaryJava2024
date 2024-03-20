package demos;

import java.util.Scanner;

import customException.A_06_PasswordTooLongExp;
import customException.A_06_PasswordTooShortExp;
public class A_06_PasswordMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		try
		{
			System.out.println("Enter the passwordd");
			String pwd=sc.next();
			int count=pwd.length();
				if(count >12) {
					 throw new A_06_PasswordTooLongExp();
				}
				if(count<8) {
					throw new A_06_PasswordTooShortExp();
				}
			
		}
		
		catch(A_06_PasswordTooLongExp e) {
			System.out.println(e.getmessage());
			
		}
		
		catch(A_06_PasswordTooShortExp e) {
		System.out.println(	e.getMessage());
		}
		
		finally{
			System.out.println("In Finally block , this block will gets executed any how  ");

		}
	}
}
