package basicArrayProgram;

public class A_06_CopyElementOfOneArrayToAnother {

	public static void main(String[] args) {

		int [] arr = new int [] {1,2,3,4,5};
		int [] copied = new int [arr.length] ;
		for(int i=0 ; i<arr.length ; i++)
		{
			copied[i]=arr[i];
		}

		for(int i=0 ; i<copied.length ; i++)
		{
			System.out.println(copied[i]);
		}
		
		//Java Program to copy all elements of one array into another array
	    //Initializing an array
	    int [] firstArray = new int [] {3, 5, 7, 9, 11};
	    /* Creating another array secondArray with same size
	     * of first array using firstArray.length as it returns
	     * the size of array firstArray.
	     */
	    int secondArray[] = new int[firstArray.length];

	    //Displaying elements of first array
	    System.out.println("Elements of First array: ");
	    for (int i = 0; i < firstArray.length; i++) {
	      System.out.print(firstArray[i] + " ");
	    }

	    //Copying all elements of firstArray to secondArray
	    for (int i = 0; i < firstArray.length; i++) {
	      secondArray[i] = firstArray[i];
	    }

	    //Displaying elements of secondArray
	    System.out.println();
	    System.out.println("Elements of Copied array: ");
	    for (int i = 0; i < secondArray.length; i++) {
	      System.out.print(secondArray[i] + " ");
	    }


	}

}
