/*----------------------------------------------------------------------------------------------------------------------	 
	 Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının tersini döndüren reversed isimli metodu NumberUtil
	 sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	 
	 123 -> 3 -> 3 * 10 + 2 = 32 -> 32 * 10 + 1 = 321
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		ReversedTest.run();
	}
}

class ReversedTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int val;
		System.out.println("Bir sayı giriniz:");
		
		while ((val = Integer.parseInt(kb.nextLine())) != 0) {			
			System.out.printf("%d sayısının tersi:%d%n", val, NumberUtil.reversed(val));
			System.out.println("Bir sayı giriniz:");
		}
		
		System.out.printf("0 sayısının tersi:%d%n", NumberUtil.reversed(0));
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int reversed(int val)
	{
		//TODO:
	}
}

