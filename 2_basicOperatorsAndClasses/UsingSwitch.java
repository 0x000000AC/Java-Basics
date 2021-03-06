/******************************************************************
* UsingSwitch.java
* Aaron P. Clark
*
* This shows the use of switch after a user inputs a zip code.
*********************************************************************/

import java.util.Scanner;  

public class UsingSwitch
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		String zip;
        
		System.out.print("Enter a zip code (example: 46142): ");
		zip = stdIn.nextLine();
		
		
		switch (zip.charAt(0))
		{
			case '0': case '2': case '3':
				System.out.println(zip + " is on the East Coast.");
				break;
			case '4': case '5': case '6':
				System.out.println(
					zip + " is in the Central Plains area.");
				break;
			case '7':
				System.out.println(zip + " is in the South.");
				break;
			case '8': case '9':
				System.out.println(zip + " is in the West.");
				break;
			default:
				System.out.println(zip + " is an invalid ZIP Code.");
		} // end switch
			
	}
}