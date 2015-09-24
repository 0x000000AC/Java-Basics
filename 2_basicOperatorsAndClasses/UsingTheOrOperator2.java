/******************************************************************
* UsingTheOrOperator2.java
* Aaron P. Clark
*
* This illustrates the or || operator
*********************************************************************/

import java.util.Scanner;  

public class UsingTheOrOperator2
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		String response;

		System.out.println("Enter q or Q: ");
		response = stdIn.nextLine();
		
		if (response.equals("q") || response.equals("Q")) 
		{
			System.out.println("\nBye");
		}
	}
}