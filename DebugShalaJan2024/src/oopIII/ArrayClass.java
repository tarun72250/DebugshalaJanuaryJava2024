package oopIII;

public class ArrayClass {
	
	public static void main(String[]args)
	{
		//Declaration of array with 5 size
		int [] arr = new int [5];
		int sum=0;
		//initiliazation of array values
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		
		
		for(int i=0 ; i<arr.length ; i++)
		{
			sum = sum+arr[i];
			System.out.println(sum);
		}
	}

}
