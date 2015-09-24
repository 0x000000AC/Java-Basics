/**********************************************
*IncrementAndDecrement
*Kalilikane Kimo
*
*This program demonstrates the use of the
*increment and decrement operators. It also
*demonstrates the use of a pre and post
*fix operators.
**********************************************/

public class IncrementAndDecrement
{
	public static void main(String[] args)
	{
		// Variable declarations
		int y = 0;
		int x = 0;
		int k = 8;
		int r = 10;

		System.out.print(y++ + "\n\n"); // Using the post increment operator to print out our value
		                                // y = y +1, however we acquire our original value of y
		                                // which is 0. Why? because the post increment operator
		                                // does the addition of 1 after the print statement which
		                                // would mean the value of y in the print statement is still 0.

		System.out.print(y + "\n\n");    // Now our y value is 1 which is what we wanted in the beginning
		                                // but as descriped earlier it only increments the value of y to 1
		                                // after the statement.

		System.out.print(++x + "\n\n"); // The pre increment operator, unlike the post increment
		                                // operator by passses the addion of 1 after the fact and instead
		                                // does the addition of 1 to our value then printts that value.

        // Same is true for the decrement operators below
		System.out.print(k-- + "\n\n");
		System.out.print(k + "\n\n");
		System.out.print(--r + "\n\n");
	}
}