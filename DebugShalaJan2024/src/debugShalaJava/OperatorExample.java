package debugShalaJava;

public class OperatorExample {

	public static void main(String[] args) {
		
		//Unary operator 
		int x = 10;
		System.out.println(x++); // 10  
		System.out.println(x);   // 11
		System.out.println(++x); // 12
		System.out.println(x--); // 12
		System.out.println(x);   // 11
		System.out.println(--x); // 10
		
		int a = 10;
		int b = -10;
		boolean c = true;
		boolean d = false;
		System.out.println(~a); // -11
		System.out.println(~b); // 9
		System.out.println(!c); // false
		System.out.println(!d); //true
		
		
		//Logical Operators
		System.out.println("\nLogical Operators");
		int e , f , g ;
		e = 10 ; f = 5 ; g = 20;
		System.out.println(e<f && f<g); //false
		System.out.println(e>f && f<g); //true
		System.out.println(e<f || f<g);  //true
		System.out.println(f>g || e>g);  //false
		
		
		//Bitwise Operators
		System.out.println("\nBitwise Operators");
		int h , i , j ;
		h = 10 ; i = 5 ; j = 20;
		System.out.println(h<i & j>i); //false
		System.out.println(h>i | j<i); //true
		System.out.println(h<j ^ j>i);  //false
		
		
		//Java Shift Operator
		System.out.println("\nShift Operator");
		System.out.println(10<<2); //10*2^2 =10*4=40 left shift
		System.out.println(10>>2); //10/2^2 =10/4=2 right shift 
		//System.out.println(10<<<2);//error not exist
		System.out.println(10>>>2);//10/2^2 =10/4=2 right shift 
		
		
		
				
	}

}
