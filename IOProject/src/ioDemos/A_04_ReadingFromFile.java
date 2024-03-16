package ioDemos;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
//This code demonstrates reading data from a file using Java's input/output (IO) classes.
public class A_04_ReadingFromFile {
	
	public static void main(String[] args) throws IOException 
	{
		//how to read characters from a file using the FileInputStream
		InputStream i = new FileInputStream("D:\\Java IOProject Programs\\Demo.txt");
//		int n; 
//		while( (n = i.read()) != -1 )
//			System.out.print((char)n);
//		i.close();
		
		//This line creates a Reader r by opening a FileReader to read from the same file. FileReader is a subclass of Reader specialized for reading character streams from files.
		Reader r = new FileReader("D:\\Java IOProject Programs\\Demo.txt");
//		int n; //Declares an integer variable n to store the data read from the file.
//		while( (n = r.read()) != -1 )//This loop reads characters from the file using the read() method of the Reader object r. It continues reading until the end of the file is reached (read() returns -1), at which point the loop terminates.
//			System.out.print((char)n);//Inside the loop, each character read from the file is converted to a char and printed to the console using System.out.print().
//		r.close();// Closes the Reader object r to release system resources after reading from the file is completed.
		int n;
		char [] arr = new char[12];
		while( (n = r.read(arr)) != -1 )
			System.out.print(new String(arr));
		r.close();
	}

}
