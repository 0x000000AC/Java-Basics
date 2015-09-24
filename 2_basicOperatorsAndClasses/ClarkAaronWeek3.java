/******************************************************************
* ClarkAaronWeek3.java
* Aaron P. Clark
*
*  This program illustrates concepts learned from
*  CS151 - Introduction to Programming.  In particular
*  the following from week 3:
*   - Use the Scanner class to accept input from the user
*   - Prompt the user for their first name, last name, and 
*	 age each individually.
*   - Use string conacatenation to obtain the user's full name.
*   - Use equals() and If their first and last name are the same
*     print: "Hello First Last, your first and last name are the 
*	 same.
*   - If your first and last name are different, print:
*     "Hello First Last, your first and last name are different."
*   - Print the length of their first name and of their full name.
*   - Use the charAt() method of String class to find the user's 
*	 initials.  Print these, followed by their ASCII value, in 
*	 tabular format
*   - Print out the name in accordance with this assignment's example
*   - Using increment, increase the age by one output in accordance
*     with the example.
*   - Using comput assignment operators, increase the age by 4 more
*	 and output the new age.
*********************************************************************/

import java.util.Scanner;  

public class ClarkAaronWeek3
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		String firstName;
		String lastName;
		int age;
		int fullNameLength;
		
		System.out.print("Please enter your first name: ");
		firstName = stdIn.next();
		System.out.print("Please enter your last name: ");
		lastName = stdIn.next();
		System.out.print("Please enter your age in years: ");
		age = stdIn.nextInt();
		
		if(firstName.equalsIgnoreCase(lastName)) 
		{
			System.out.print("\nHello " + firstName + " " + lastName + 
			", your first and last name are the same\n\n");
		} else
		 {
			System.out.print("\nHello " + firstName + " " + lastName +
			", your first and last name are different\n\n");
		 }
		
		System.out.println("The length of your first name is: " + firstName.length());
		fullNameLength = firstName.length() + lastName.length();
		System.out.println("The length of your full name is: " + fullNameLength);
		
		System.out.print("\nInits\tASCII Value\n" + firstName.charAt(0) + "\t" + 
		(int)firstName.charAt(0) + "\n" + lastName.charAt(0) + "\t" + (int)lastName.charAt(0) + "\n");
		
		System.out.print("\nYou are now " + age + " years old.\n\n");
		
		
		System.out.print("In one year you will be " + (++age) + ".\n");
		
		
		System.out.print("In five years you will be " + (age+=4) + ".");
		
	}
}




















