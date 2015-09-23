/***********************************************
* CirclePrompt.java
* Aaron P. Clark
*
* Created to understand java.util.Scanner
* Prompts user for favorite shape.  If 'circle'
* is entered, computes area.
***********************************************/

import java.util.Scanner;

public class CirclePrompt 
{
	public static void main(String args[])
	{
		String favShape;    // Declaring what types of variables this program will contain
		float radius;
		float area;
		
		Scanner in = new Scanner(System.in);  // Sets the scanner variable "in" to what is typed when prompted
		
		System.out.println("Enter your favorite shape ");
		favShape = in.nextLine();
		
		if (favShape.equals("circle"))    // I had to lookup how to use if with strings instead of numerics
		{
			System.out.println("Enter a radius value: ");
			radius = in.nextFloat();   // You can also have in.nextInt or in.nextString based on variable type
			area = (float) (3.14159*radius*radius);  // I had to typecast this as a float to get it to work
			System.out.println("The area of the circle is: " + area);
		}
	System.out.println("End of shape algorithm.  Seeya!");  // If someone enters anything but a circle, they get here or when the if ends they get here
	}
}
