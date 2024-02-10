package basicArrayProgram;

public class A_02_PrintSumMaxMinAvgInArray {

	public static void main(String[] args) {
		//if we want to sum of all array values
				int sum=0;
				int [] arr2 = {1,2,3,4,5,6};

				for(int i=0 ; i<arr2.length ;i++) //0<=5  1<=5  2<=5  3<=5  4<=5  5<=5
				{
					sum = sum +arr2[i]; //0+1=1  1+2=3  3+3=6  6+4=10  10+5=15   15+6=21 
				}
				System.out.println("Sum :- "+sum);
				
				//we can also declare like this 
				for(int i=0 ; i<arr2.length ;i++) //0<=5  1<=5  2<=5  3<=5  4<=5  5<=5
				{
					sum += arr2[i]; //0+1=1  1+2=3  3+3=6  6+4=10  10+5=15   15+6=21 
				}
				System.out.println("Sum :- "+sum);
				
				//U can do multiply of all these nos.
				int mul=1;
				for(int i=0 ; i<arr2.length ;i++) //0<=5  1<=5  2<=5  3<=5  4<=5  5<=5
				{
					mul = mul * arr2[i]; //0+1=1  1+2=3  3+3=6  6+4=10  10+5=15   15+6=21 
				}
				System.out.println("Sum :- "+mul);
			
				//You can also declare array like this.
				int [] numbers = new int [] {2, 4, 6, 8, 10, 12,15,13,12,15};
				int max = numbers[0];
				//U can find max value in these elements
				for(int i=0 ; i<numbers.length;i++)
				{
					if(max < numbers[i])
					{
						max = numbers[i];
					}
				}
				System.out.println("Maximum :- "+max);
				//U can find min value in these elements
				//U can find average value in these 
				int sum1=0;
				int avg=0;
				for( int i=0 ;i<numbers.length ;i++)
				{
					sum1 = sum1 + numbers[i]; 
					avg = sum1 / numbers.length;
				}
				System.out.println("Average:- "+avg);
			

				
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


	}

}
