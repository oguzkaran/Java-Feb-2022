/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın no-modifier bölümü aynı paketteki diğer sınıflar için public anlamındadır (friendly)
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{

	}
}


class B {
	public void bar()
	{
		A a = new A();

		a.x = 10;
		a.foo();
	}
}

class A {
	int x;
	A()
	{
		//...
	}

	void foo()
	{
		//...
	}
}