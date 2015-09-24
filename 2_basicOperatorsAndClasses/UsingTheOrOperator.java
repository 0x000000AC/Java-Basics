/******************************************************************
* UsingTheOrOperator.java
* Aaron P. Clark
*
* This illustrates the or || operator
*********************************************************************/

import java.util.Scanner;  

public class UsingTheOrOperator
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		String response;

		System.out.println("Enter q or Q: ");
		response = stdIn.nextLine();
		
		if (response == "q" || response == "Q") //This compiles but doesn't "work" don't use == to compare strings
		{
			System.out.println("\nBye");
		}
	}
}