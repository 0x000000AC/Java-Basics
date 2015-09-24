/***********************************************
* ScannerClassForUserInput.java
* Aaron P. Clark
*
* This program illustrates the Scanner Class
***********************************************/

import java.util.Scanner;

public class ScannerClassForUserInput
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		String name;
		
		System.out.print("Enter your name: ");
		name = stdIn.nextLine();
		System.out.println("Hello " + name + "!");
		
	} // end main
} // end class ScannerClassForUserInput