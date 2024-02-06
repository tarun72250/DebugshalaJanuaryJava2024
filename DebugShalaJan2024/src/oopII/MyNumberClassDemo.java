package oopII;

public class MyNumberClassDemo {

	public static void main(String[] args) {
        // Create an object and perform tests
        MyNumberClass num = new MyNumberClass(-5);
        System.out.println("Is negative? " + num.isNegative());
        System.out.println("Is positive? " + num.isPositive());
        System.out.println("Is zero? " + num.isZero());
        System.out.println("Is odd? " + num.isOdd());
        System.out.println("Is even? " + num.isEven());
        
        System.out.println();
        MyNumberClass num1 = new MyNumberClass(5);
        System.out.println("Is negative? " + num1.isNegative());
        System.out.println("Is positive? " + num1.isPositive());
        System.out.println("Is zero? " + num1.isZero());
        System.out.println("Is odd? " + num1.isOdd());
        System.out.println("Is even? " + num1.isEven());
        
        System.out.println();
        MyNumberClass num2 = new MyNumberClass(-5);
        System.out.println("Is negative? " + num2.isNegative());
        System.out.println("Is positive? " + num2.isPositive());
        System.out.println("Is zero? " + num2.isZero());
        System.out.println("Is odd? " + num2.isOdd());
        System.out.println("Is even? " + num2.isEven());
    }

}
