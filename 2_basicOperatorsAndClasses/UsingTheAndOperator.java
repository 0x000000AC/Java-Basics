/******************************************************************
* UsingTheAndOperator.java
* Aaron P. Clark
*
* This takes a user's input, converts it over to a double, and 
* prints out a value based on that temp with the conditional below
*********************************************************************/

import java.util.Scanner;  
import static java.lang.Math.*;

public class UsingTheAndOperator
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		String usersInput;
		double temp;
		
		
		System.out.println("Input a temperature: ");
		usersInput = stdIn.nextLine();
		temp = Double.parseDouble(usersInput); // You could also use Integer.parseInteger() if you for some
											   // reason you didn't wish to include integer output.
		
		if (temp >= 50 && temp <= 90)
		{
			System.out.println("OK");
		} else
		 {
			System.out.println("not OK");
		 }
	}
}