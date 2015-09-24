public class DRIVEN
{
	private int numerator;
	private int denominator;
	private double quotient;
	
	
	public DRIVEN()
	{
	}
	
	//****************************************************************
	
	public DRIVEN(int n, int d)
	{
		this.numerator = n;
		this.denominator = d;
	}	
	
	//****************************************************************
	
	public void print()
	{
		System.out.println(this.numerator + "/" + this.denominator);
	}
	
	//****************************************************************
	
	public void printAsDouble()
	{
		System.out.println((double) this.numerator/this.denominator);
	}
	
	//****************************************************************

	public DRIVEN add(DRIVEN other)
	{
		if (this.numerator == 0 && this.denominator == 0)
    	{
        	this.numerator = other.numerator;
        	this.denominator = other.denominator;
        }
    	else
    	{
        	this.numerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        	this.denominator = other.denominator * denominator;
    	}
		
		return this;
	}
	
	
	//****************************************************************
	
	public DRIVEN multiply(DRIVEN other)
	{
		if (this.numerator == 1 && this.denominator == 1) // This conditional catches x = new DRIVEN(1, 1) in the ClarkAaronProg7 Driver
    	{
        	this.numerator = other.numerator;
        	this.denominator = other.denominator;
        }
    	else
    	{
        	this.numerator = this.numerator * other.numerator;
        	this.denominator = this.numerator * other.numerator;
    	}
		
		return this;
	}
	
	//****************************************************************
	
	
} // end class Fraction