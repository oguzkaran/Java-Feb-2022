/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıfın non-static bir metodu sınıf dışından sınıf ismi ve nokta operatörü ile çağrılamaz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{		
		Sample.foo(); //error
	}
}

class Sample {
	public void foo()
	{
		//...
	}
}