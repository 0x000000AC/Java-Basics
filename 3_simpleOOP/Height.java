/****************************************************************
Height.java
Dean & Dean

This class stores and prints height values and demonstrates overloading methods
****************************************************************/

public class Height
{
	double height;  // a person's height
	String units; // like cm for centimeters
	
	//****************************************************************
	
	public void setHeight(double height)
	{
		this.height = height;
		this.units = "cm";
	}
	
	//****************************************************************
	
	public void setHeight(double height, String units)
	{
		this.height = height;
		this.units = units;
	}
	
	//****************************************************************
	
	public void print()
	{
		System.out.println(this.height + " " + this.units);
	}
		
} // end class Height