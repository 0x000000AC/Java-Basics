/****************************************************************
Employee3.java
Dean & Dean

This gives an employee a permanent name.
****************************************************************/

import java.util.Scanner;

public class Employee3
{
	Scanner stdIn = new Scanner(System.in);
	public final String NAME; // declaration of instance constant
	
	//****************************************************************
	
	public Employee3(String name)
	{
		this.NAME = name; // initialization of instance constant
	} // end constructor
} // end class Employee3