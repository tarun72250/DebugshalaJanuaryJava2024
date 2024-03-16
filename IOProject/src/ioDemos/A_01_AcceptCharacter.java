package ioDemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//This code reads characters from the standard input stream (System.in)means console using a BufferedReader
public class A_01_AcceptCharacter {
	
	public static void main(String[] args) 
	{
		//BufferedReader class in Java that allows you to efficiently read text from character-input stream. It's particularly useful when you're reading text from a source like a file, a socket, or the console.thats y we use BufferedReader
		BufferedReader br =null;
		try
		{
			//1.open the stream
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 'q' to quit");
			int n;
			//2. use the stream
			//asking the user to enter 'q' to quit. Enters a loop that reads characters from the input stream until the character 'q' is entered. Each character read is printed to the console.
			while((n=br.read()) != 'q')//read value till q is enter
			{
				System.out.println((char)n);//type n into char
			}			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try {
				//3.close stream
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
	}
}
