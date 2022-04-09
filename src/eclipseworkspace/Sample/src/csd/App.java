/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayıdan büyük ilk Fibonacci sayısına geri dönen nextFibonacciNumber
	isimli metodu yazınız ve aşağıdaki kod ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{		
		NextFibonacciNumberTest.run();		
	}
}

class NextFibonacciNumberTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
			
			if (val < -999)
				break;
			
			System.out.printf("%d. sayısından büyük ilk Fibonacci sayısı:%d%n", val, NumberUtil.nextFibonacciNumber(val));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int nextFibonacciNumber(int n) 
	{
		//TODO:
	}
	
	public static int fibonacciNumber(int n) 
	{
		if (n <= 2)
			return n - 1;
		
		int prev1 = 1, prev2 = 0, val = 0;
		
		for (int i = 2; i < n; ++i) {
			val = prev1 + prev2;			
			prev2 = prev1;
			prev1 = val;
		}
		
		return val;
	}
}