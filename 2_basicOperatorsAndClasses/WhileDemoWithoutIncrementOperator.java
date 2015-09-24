/***********************************************
* WhileDemoWithoutIncrementOperator.java
* Aaron P. Clark
*
* This program is used to demonstrate while loops
* and providing an accompanying example for my CS151
* Week 3 Question about Increment Operators
***********************************************/

import java.util.Scanner;
public class WhileDemoWithoutIncrementOperator
{
	public static void main (String [] args)

	{

		int count, number;

		System.out.print("Enter a number: ");
		Scanner keyboard = new Scanner (System.in);

		number = keyboard.nextInt ();

		count = 1;

		while (count <= number)

		{

			System.out.print (count + ", ");

			count = count + 1;  //Here is our lack of increment operator

		}

    System.out.println();

    System.out.println ("And so on.... ");

	}
}