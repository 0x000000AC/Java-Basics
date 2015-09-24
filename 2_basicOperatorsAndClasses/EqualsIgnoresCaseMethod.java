/***********************************************
* EqualsIgnoresCaseMethod.java
* Aaron P. Clark
*
* This program compares strings and illustrates the use of the equalsIgnoresCase method
***********************************************/

public class EqualsIgnoresCaseMethod
{
	public static void main(String[] args)
	{
		String animal1 = "Horse";
		String animal2 = "Fly";
		String newCreature;
		
		newCreature = animal1 + animal2;
		System.out.println(newCreature.equalsIgnoreCase("HorseFly"));
		System.out.println(newCreature.equalsIgnoreCase("horsefly"));
		
	} // end main
} // end class EqualsIgnoresCaseMethod