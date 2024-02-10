package basicArrayProgram;

import java.util.Scanner;

public class A_05_ReverseANumber {

	public static void main(String[] args) {
		
		//for loop using : Logic to find out the reverse number
		System.out.println("Using for loop");
		for(int i=6 ; i>=1 ; i--)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\nUsing while for loop");
		//While Loop: Logic to find out the reverse number
		 int num = 123456;
		 int reversenum =0;
	      while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }

	      System.out.println("Reverse of input number is: "+reversenum);

	}

}
