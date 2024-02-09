package basicJava100Program;

public class A_05_PrimeNo {

	public static void main(String[] args) {
		
		int n =20;
		
		for(int i=1 ; i<=n ; i++)
		{
			boolean isPrime =true;   //
			for(int j=2 ; j<i ; j++)
			{
				if(i%j ==0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime == true)
				System.out.println("Prime no:"+i);
		}
	}

}
