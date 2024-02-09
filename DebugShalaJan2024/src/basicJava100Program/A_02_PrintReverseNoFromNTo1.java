package basicJava100Program;

import java.util.Scanner;

public class A_02_PrintReverseNoFromNTo1 {

	public static void main(String[] args) {
		
//		for(int i =10 ; i >= 1 ; i--) //10>=1  9>=1
//		{
//			System.out.println(i);//10  9
//		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:");
		
		int n =sc.nextInt();
		
		for(int i = n ;i >= 1 ; i--)
		{
			System.out.println(i);
		}
	}

}
