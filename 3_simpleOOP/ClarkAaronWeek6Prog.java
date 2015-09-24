/*******************************************************************
* ClarkAaronWeek6Prog.java
* Aaron P. Clark
*
* 
*   This program fulfills partial requirements for CS151 - Introduction
*   to Programming and implements the following:
*   
*	Write a driver program that reads in 3 pets of type Cat and prints out the name and age of 
*   all cats with claws and over 3 years old.
*
*	The following information should be read in:
*		Name
*		Age
*		Weight
*		Breed
*		Declawed
*
*	This is novice code; the 3 instantiated variables could be 
*	reduced in a loop; unfortunately, I'm out of time in getting this in.
*	It could also use a hefty dose of input validation.
********************************************************************/

import java.util.Scanner;
	
public class ClarkAaronWeek6Prog
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in); // User Input data
		Cat cat1 = new Cat();			// Cat 1
		Cat cat2 = new Cat();			// Cat 2
		Cat cat3 = new Cat();			// Cat 3
		String name;							// Input name for cat
		String newBreed;						// Input string for breed
		boolean declawed;						// True for declawed, false for not declawed
		int age;								// Input age for the cat
		double weight;							// Input weight of the cat
		
		// Input information that pertains to Cat 1
			System.out.print("Enter name of Cat 1: ");
			name = stdIn.next();
			cat1.setName(name);
		
			System.out.print("Enter age of Cat 1: ");
			age = stdIn.nextInt();
			cat1.setAge(age);
		
			System.out.print("Enter the weight of Cat 1: ");
			weight = stdIn.nextDouble();
			cat1.setWeight(weight);
		
			System.out.print("Enter the breed of Cat 1: ");
			newBreed = stdIn.next();
			cat1.setBreed(newBreed);
		
			System.out.println("Does the cat have claws? True or False?: ");
    		declawed = stdIn.nextBoolean();
    		cat1.setDeclawed(declawed);
		
		// Input information that pertains to Cat 2
			System.out.print("\nEnter name of Cat 2: ");
			name = stdIn.next();
			cat2.setName(name);
		
			System.out.print("Enter age of Cat 2: ");
			age = stdIn.nextInt();
			cat2.setAge(age);
		
			System.out.print("Enter the weight of Cat 2: ");
			weight = stdIn.nextDouble();
			cat2.setWeight(weight);
		
			System.out.print("Enter the breed of Cat 2: ");
			newBreed = stdIn.next();
			cat2.setBreed(newBreed);
		
			System.out.println("Does the cat have claws? True or False?: ");
    		declawed = stdIn.nextBoolean();
    		cat2.setDeclawed(declawed);
		
		// Input information that pertains to Cat 3
			System.out.print("\nEnter name of Cat 3: ");
			name = stdIn.next();
			cat3.setName(name);
		
			System.out.print("Enter age of Cat 3: ");
			age = stdIn.nextInt();
			cat3.setAge(age);
		
			System.out.print("Enter the weight of Cat 3: ");
			weight = stdIn.nextDouble();
			cat3.setWeight(weight);
		
			System.out.print("Enter the breed of Cat 3: ");
			newBreed = stdIn.next();
			cat3.setBreed(newBreed);
		
			System.out.println("Does the cat have claws? True or False?: ");
    		declawed = stdIn.nextBoolean();
    		cat3.setDeclawed(declawed);
		
		System.out.print("\nThe Cats over 3 with claws are:\n");
		
		// All of the conditions print out the name and age of a cat if they're over 3
		// years old and have claws
		
		if(cat1.getAge() >= 3 && cat1.isDeclawed())
		{
			System.out.print("\nName: " + cat1.getName() + "\n" + "Age: " + cat1.getAge() + "\n");
		}
		if(cat2.getAge() >= 3 && cat2.isDeclawed())
		{
			System.out.print("\nName: " + cat2.getName() + "\n" + "Age: " + cat2.getAge() + "\n");
		}
		if(cat3.getAge() >= 3 && cat3.isDeclawed())
		{
			System.out.print("\nName: " + cat3.getName() + "\n" + "Age: " + cat3.getAge() + "\n");
		}

	} 
}