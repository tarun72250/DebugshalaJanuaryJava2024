package basicJava100Program;
//Write a program to Print 1 to N numbers?
public class A_01_PrintFrom1To100 {

	public static void main(String[] args) {

		/*//1.Approach
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(10);
	
		
		//2.Approach
		//for loop
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(i);
		}
			*/
		
		
		//3.Approach
		int a = 1;
		while(a <= 100)//1<=10   2<=10    3<=10   4<=10
		{
			System.out.println(a);//1  2  3  4  5  6  7  8  9  10
			a++;//2  3  4  5  6  7  8  9  10
		}
	}

}
