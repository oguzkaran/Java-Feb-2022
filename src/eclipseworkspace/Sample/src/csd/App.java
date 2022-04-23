/*----------------------------------------------------------------------------------------------------------------------	 
	 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{	
		
	}
}

class MyMath {	
	public static int abs(int a) //#1
	{
		System.out.println("abs, int");
		
		return a < 0 ? -a : a; 
	}
	
	public static double abs(double a)  //#2
	{
		System.out.println("abs, double");
		
		return a < 0 ? -a : a; 
	}
	
	public static float abs(float a)  //#3
	{
		System.out.println("abs, float");
		
		return a < 0 ? -a : a; 
	}
	
	
	public static long abs(long a)  //#4
	{
		System.out.println("abs, long");
		
		return a < 0 ? -a : a; 
	}
}
