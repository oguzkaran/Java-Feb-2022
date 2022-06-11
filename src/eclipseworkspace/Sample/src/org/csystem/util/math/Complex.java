/*----------------------------------------------------------------------
	FILE        : Complex.java
	AUTHOR      : Java-Feb-2022 Group
	LAST UPDATE : 11.06.2022

	Complex class that represents a complex number

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math;

public class Complex {
	public double real;
	public double imag;
	
	public static Complex add(double a1, double b1, double a2, double b2) //İleride bu metot gizlenecektir
	{		
		return new Complex(a1 + a2, b1 + b2);
	}
	
	public static Complex subtract(double a1, double b1, double a2, double b2) //İleride bu metot gizlenecektir
	{		
		return add(a1, b1, -a2, -b2);	
	}
	
	public static Complex multiply(double a1, double b1, double a2, double b2) //İleride bu metot gizlenecektir
	{		
		return new Complex(a1 * a2 - b1  * b2, a1 * b2 + a2 * b1);	
	}
	
	public Complex()
	{		
	}
	
	public Complex(double re)
	{
		real = re;		
	}
	
	public Complex(double re, double im)
	{
		real = re;
		imag = im;
	}
	
	public double getNorm()
	{
		return Math.sqrt(real * real + imag * imag);
	}
	
	public double getLength()
	{
		return getNorm();
	}
	
	public Complex getConjugate()
	{
		return new Complex(real, -imag);
	}
	
	//add	
	public static Complex add(double value, Complex z)
	{
		return add(value, 0, z.real, z.imag);		
	}
	
	public Complex add(Complex other)
	{
		return add(real, imag, other.real, other.imag);
	}
	
	public Complex add(double value)
	{
		return add(real, imag, value, 0);
	}
	
	//subtract
	public static Complex subtract(double value, Complex z)
	{
		return subtract(value, 0, z.real, z.imag);		
	}
	
	public Complex subtract(Complex other)
	{
		return subtract(real, imag, other.real, other.imag);
	}
	
	public Complex subtract(double value)
	{
		return subtract(real, imag, value, 0);
	}
	
	
	//multiply
	public static Complex multiply(double value, Complex z)
	{
		return multiply(value, 0, z.real, z.imag);		
	}
	
	public Complex multiply(Complex other)
	{
		return multiply(real, imag, other.real, other.imag);
	}
	
	public Complex multiply(double value)
	{
		return multiply(real, imag, value, 0);
	}
	
	//divide (TODO)
	
	//inc
	public void inc(double value)
	{
		real += value;
	}
	
	public void inc()
	{
		inc(1);
	}
	
	//dec
	public void dec(double value)
	{
		inc(-value);		
	}
	
	public void dec()
	{
		dec(1);
	}	
	
	public String toString()
	{
		return String.format("|%.2f, %.2f| = %f", real, imag, getNorm());
	}
}

