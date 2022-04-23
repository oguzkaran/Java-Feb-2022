/*----------------------------------------------------------------------------------------------------------------------	 
	Bir metodun geri dönüş değeri bilgisinin de overload işlemine etkisi yoktur 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{	
		
	}
}

class Sample {
	public static void foo() //error
	{
		System.out.println("Sample.foo");
	}
	
	public static int foo() //error
	{
		System.out.println("Sample.foo");
		
		return 10;
	}
}


