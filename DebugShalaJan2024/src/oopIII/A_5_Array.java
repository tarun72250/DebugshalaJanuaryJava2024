package oopIII;

import java.util.Scanner;

public class A_5_Array {

	public static void min(int[] arr)
	{
		
	//int[] arr={2,4,6,8,10};
	int min=arr[0];
	
	for(int i=0;i<5;i++)
		{
		if(arr[i]<min)
		  min=arr[i];
		}
		System.out.println("Minimum value is:"+min);
	}
	

	public static void max(int []arr)
	{
	int max=arr[0];
	for(int i=0;i<5;i++)
		{
		if(arr[i]>max);
		max=arr[i];
		}
	System.out.println("Maximum value is:"+max);
	}
	
	public static void average(int[] arr)
	{
	double avg=0;
	int sum=0;
	for(int i=0;i<5;i++)
	{
	
	sum+=arr[i];
	}
	avg=sum/5;
	System.out.println("Average is:"+avg);
	}
	
	public static void main(String args[])
	{
	Scanner ob=new Scanner(System.in);
	int[]arr=new int[5];
	System.out.println("Enter value of array");
	for(int i=0;i<5;i++)
	{
		arr[i]=ob.nextInt();
		
	}
	//in same class we cannot use class name as well.
	min(arr);
	max(arr);
	average(arr);
	}
}
