/*******************************************************************
* FRACTIONDRIVERPRACTICE.java
* Aaron P. Clark
*
* 
*   
********************************************************************/

import java.util.Scanner;
	
public class FRACTIONDRIVERPRACTICE
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in); // User Input data
		DRIVEN c, d, x; 
		
		System.out.println("Enter numerator; then denominator.");
		c = new DRIVEN(stdIn.nextInt(), stdIn.nextInt());
		c.print();

		System.out.println("Enter numerator; then denominator.");
		d = new DRIVEN(stdIn.nextInt(), stdIn.nextInt());
		d.print();

		x = new DRIVEN(); // create a fraction for number 0

		System.out.println("Sum:");
		x.add(c).add(d);
		x.print();
		x.printAsDouble();

		x = new DRIVEN(1, 1); // create a fraction for number 1

		System.out.println("Product:");
		x.multiply(c).multiply(d);
		x.print();
		x.printAsDouble();

		System.out.println("Enter numerator; then denominator.");

		x = new DRIVEN(stdIn.nextInt(), stdIn.nextInt());
		x.printAsDouble();
	} // end main
} // end class ClarkAaronProg7