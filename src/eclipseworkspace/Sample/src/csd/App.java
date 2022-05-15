/*----------------------------------------------------------------------------------------------------------------------	 
	Math sınıfının random metodu [0, 1) aralığında rasgele üretilmiş double türden bir değere geri döner. Bu metot 
	içsel olarak her çağıramda aynı Random nesnesini kullanır. Bu metot ilk kez çağrıldığında kullandığı Random
	nesnesi yaratılır ve her çağrıda bu nesne kullanılır. Aşağıdaki örneğin yaklaşık eşdeğeri:
	
	java.util.Random r = new java.util.Random();
	
	for (int i = 0; i < 10; ++i)
		System.out.println(r.nextDouble());
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		for (int i = 0; i < 10; ++i)
			System.out.println(Math.random());
	}
}

