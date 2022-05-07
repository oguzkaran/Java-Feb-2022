/*----------------------------------------------------------------------------------------------------------------------	 
	Aşağıdaki örneği inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{	
		Sample s, k;	
		
		s = new Sample();
		k = new Sample();		
		
		s.a = 20;
		s.b = true;
		
		k.a = 30; 
		
		System.out.printf("s.a = %d%n", s.a);
		System.out.printf("s.b = %b%n", s.b);
		System.out.printf("k.a = %d%n", k.a);
		System.out.printf("k.b = %b%n", k.b);
		System.out.println("------------------------------------");
		
		s = k; //**
		
		System.out.printf("s.a = %d%n", s.a);
		System.out.printf("s.b = %b%n", s.b);
		System.out.printf("k.a = %d%n", k.a);
		System.out.printf("k.b = %b%n", k.b);
		System.out.println("------------------------------------");
		
		++s.a;
		
		System.out.printf("s.a = %d%n", s.a);
		System.out.printf("s.b = %b%n", s.b);
		System.out.printf("k.a = %d%n", k.a);
		System.out.printf("k.b = %b%n", k.b);
		System.out.println("------------------------------------");
		
		s = new Sample();
		
		--s.a;
		
		System.out.printf("s.a = %d%n", s.a);
		System.out.printf("s.b = %b%n", s.b);
		System.out.printf("k.a = %d%n", k.a);
		System.out.printf("k.b = %b%n", k.b);
		System.out.println("------------------------------------");
	}
}


class Sample {
	public int a;
	public boolean b;
	
	//...
}
