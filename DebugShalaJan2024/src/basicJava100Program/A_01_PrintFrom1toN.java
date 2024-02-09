package basicJava100Program;

import java.util.Scanner;

public class A_01_PrintFrom1toN
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int n = sc.nextInt();
		for(int i=1 ; i<=n ; i++)
		{
			System.out.println(i);
		}
		
	}
}
