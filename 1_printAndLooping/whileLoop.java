/***********************************************
* whileLoop.java
* Aaron P. Clark
*
* I created this for Park programming class to learn
* how to accept command-line input in a loop
***********************************************/
import java.util.Scanner;  
 
public class whileLoop
 
{
    public static void main(String[] args)
     
    {
        //Declares the y/n in repeat and the user input values
		
		String repeat;
		float UserInpVal;
		float UserInpSqd;        
		
        
		// I had to make the different scanner inputs unique.  "keyboard" and "in" or it would terminate the
		// while loop after the squared number is shown
		
		Scanner keyboard = new Scanner(System.in);
        Scanner in = new Scanner(System.in); 
		
        
		System.out.println("Would you like to square some numbers? Enter y/n ");
            repeat = keyboard.nextLine();
         
        while (repeat.equalsIgnoreCase("y")) // I could use .equals, but ignoring the case is usually useful
        {
            System.out.println("Enter a number: ");
			UserInpVal = in.nextFloat();   
			UserInpSqd =(UserInpVal*UserInpVal);  
			System.out.println("Your number squared is: " + UserInpSqd);
			
			System.out.println("Would you like to continue? Enter y/n ");
            repeat = keyboard.nextLine();
        }
         
    }
}