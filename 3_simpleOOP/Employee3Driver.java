/****************************************************************
Employee3Driver.java
Dean & Dean

This instantiates an object and prints permanent attribute.
****************************************************************/

import java.util.Scanner;

public class Employee3Driver
{
	public static void main(String[] args)
	{
		Employee3 waitress = new Employee3("Angie Klein");
		
		System.out.println(waitress.NAME); // direct access to instance constant
	} // end main
} // end class Employee3Driver