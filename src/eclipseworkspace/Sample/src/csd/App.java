/*----------------------------------------------------------------------------------------------------------------------	 
	 Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının faktoriyel değerini döndüren factorial isimli metodu
	 NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	 Açıklamalar:
	 - Faktoriyel işlemi aşağıdaki gibidir: 
		 0! = 1
		 1!= 1
		 2! = 1 * 2
		 3! = 1 * 2 * 3
		 
		 ...
		 
		 n! = 1 * 2 * 3 * ... * (n - 1) * n
	 
	 - Negatif sayılar için faktoriyel değeri 1 olarak döndürelecektir	 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		GetPrimeTest.run();
	}
}

class GetPrimeTest {
	public static void run()
	{		
		for (int n = -1; n <= 12; ++n)
			System.out.printf("%d! = %d%n", n, NumberUtil.factorial(n));
	}
}

class NumberUtil {
	public static int factorial(int n)
	{
		//TODO:
	}	
	
}

