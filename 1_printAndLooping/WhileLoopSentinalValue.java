/***********************************************
* WhileLoopSentinalValue.java
* Aaron P. Clark
*
* while loop 
* Takes scores and computes average.  
***********************************************/
 
import java.util.Scanner;  
 
public class WhileLoopSentinalValue
 
{
    public static void main(String[] args)
     
    {
        //Declares the y/n in repeat and the user input values
		
		String repeat;
		int totalScore;
		int count;        
		int average;
		int score;
		
		count = 0;
		totalScore = 0;
        average = 0;
		score = 0;
		
		Scanner keyboard = new Scanner(System.in);
        Scanner in = new Scanner(System.in); 
		
        
		System.out.println("Enter score (-1 to quit) ");
            score = keyboard.nextInt();
         
        while (score != -1)
        {
            totalScore = totalScore + score;
			count++;
			System.out.println("Enter score (-1 to quit) ");
			score = in.nextInt();   
			
			average = (int) (totalScore/count);
			
			System.out.println("The average score is: " + average);
			
        }
         
    }
}