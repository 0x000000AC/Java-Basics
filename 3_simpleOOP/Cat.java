/*******************************************************************
* Cat.java
* Aaron P. Clark
*
*  This program fulfills partial requirements for CS151 - Introduction
*  to Programming and implements the following:
*  
*  The new class has attributes of:
*  name - type String
*  age - type integer
*  weight - type double
*  breed - type string
*  declawed - type boolean  True for no claws, false for has claws
*  
*  Cat.java is used in conjunction with ClarkAaronWeek6Prog.java
*  to demonstrate objects and OOP practices. ClarkAaronWeek6Prog.java
*  is Cat.java's driver class
* 
*	I'm fully aware that this code is not elegant and can be condensed.
*	I am presently working on it.
********************************************************************/

import java.util.Scanner;
	
public class Cat
{
	 private String breed;			// The string that will give the cat's breed
	 private boolean declawed;		// Is the cat declawed?  Returns True if it does, False if not
	 private String name; 			// Holds the value for the cat's name
	 private int age; 				// The cat's age in years
	 private double weight;			// The cat's weight in pounds
	 
	//************************************
			// Mutator Method for taking input names from ClarkAaronWeek6.java
	public void setName(String name)
    {
        this.name = name;
    }
    
    //************************************
    		// Accessor Method for returning input name when called from ClarkAaronWeek6.java
    public String getName()
    {
    	return name;
    }

	//************************************
			// Mutator Method for taking "breed" input from ClarkAaronWeek6.java
  	public void setBreed(String newBreed)
    {
        breed = newBreed; 
    }

	//************************************
			// Accessor Method for returning input breed when called from ClarkAaronWeek6.java
    public String getBreed()
    {
        return breed;
    }
    
    //************************************
			// Mutator Method for taking age input from ClarkAaronWeek6.java
	public void setAge(int age)
	{
		this.age += age;
	}
	
	//************************************
			// Accessor Method for returning input age when called from ClarkAaronWeek6.java
	public int getAge()
	{
		return age;
	}
   
   	//************************************
   			// Mutator Method for taking weight input from ClarkAaronWeek6.java
   	public void setWeight(double weight)
   	{
   		this.weight +=weight;
   	}
   	
   	//************************************
   			// Accessor Method for returning input weight when called from ClarkAaronWeek6.java
   	public double getWeight()
   	{
   		return weight;
   	}
   	
   	//************************************
   			// Mutator Method for taking declawed input from ClarkAaronWeek6.java
   			// THIS SHOULD PROBABLY BE A BOOLEAN METHOD
   	public void setDeclawed(boolean declawed)
	{
		this.declawed = declawed;
		
	}
	
	//************************************
			// Accessor Method for taking declawed input from ClarkAaronWeek6.java
	public boolean isDeclawed()
	{
		return declawed;
	}
	
	//************************************
	
} // end Cat Class
