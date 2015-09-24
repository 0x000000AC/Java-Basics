/***********************************************
* ScannerClassForUserInput2.java
* Aaron P. Clark
*
* This program illustrates the Scanner Classs
***********************************************/

import java.util.Scanner;

public class ScannerClassForUserInput2
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		String name;
		String name2;
		
		System.out.print("Enter your name: ");
		name = stdIn.nextLine();
		System.out.println("Hello " + name + "!");
		
		System.out.print("Enter some other schniz: ");
		name2 = stdIn.nextLine();
		System.out.println("Also " + name2);
	} // end main
} // end class ScannerClassForUserInput2