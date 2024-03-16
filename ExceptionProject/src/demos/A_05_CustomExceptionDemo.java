package demos;

import java.util.Scanner;
import customException.*;
public class A_05_CustomExceptionDemo 
{

	public static void inputname(String firstn,String lastn) {
		try {
			char ch = firstn.charAt(0);
		if (ch>='A' && ch<='Z') {
			System.out.println("Welcome "+firstn+" "+lastn);
	} 
	else {
		throw new A_05_NameException(firstn,lastn);
	}
	}
		catch (A_05_NameException e) 
		{
			System.out.println(e.tostring());
		}    
		
		}
	public static void main(String [] args) {
		Scanner sc=new Scanner (System.in);
		
		String firstn;
		String lastn;
		
		System.out.println("Enter first name");
		firstn=sc.next();
		
		System.out.println("Enter last name");
		lastn=sc.next();
		
		inputname(firstn,lastn);
		
		
		
	}

}
