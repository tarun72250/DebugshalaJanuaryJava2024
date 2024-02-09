package oopIII;

public class ArrayClass {
	
	public static void main(String[]args)
	{
		//Declaration of array 
		int [] arr ;
		//Array creation on heap on size 5
		arr= new int [5];
		//for accessing the element of array
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		
		//short way of declaring the array 
		int [] arr1 = {12,23,34,4,5,6};
		for(int i=0 ; i<arr1.length ; i++)
		{
			System.out.println(arr1[i]);
		}
		
		//if u want to print horizontly
		int [] arr2 = {12,23,34,4,5,6};
		for(int i=0 ; i<arr2.length ; i++)
		{
			System.out.print(arr2[i]+" , ");
		}
		
		
		
		System.out.println("\n 2d array ");
		//if u want print 2d array or matrix print
		int [][]matrix = {{1,2,3},{4,5,6},{1,2,3}};
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<matrix[i].length ; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n second 2d array ");
		//if u want print 2d array or matrix print
		int [][]matrix1 = {{1},{4,5},{1,2,3}};
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<matrix1[i].length ; j++)
			{
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//if i want to create date objects array
		Date [] datearr ;
		datearr = new Date[3];//array of 3 date object
		datearr[0]= new Date();//default cons
		datearr[1]= new Date(11,12,2024);//default cons
		datearr[2]= new Date(12,11,2022);//default cons
		for(int i=0 ; i<datearr.length ; i++)
		{
			datearr[i].showDate();
		}
		
		
		
		
		//sum of all array elements
//		int sum=0;
//		for(int i=0 ; i<arr.length ; i++)
//		{
//			sum = sum+arr[i];
//			System.out.println(sum);
//		}
	}

}
