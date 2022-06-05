/*----------------------------------------------------------------------------------------------------------------------	 
	Homework-005-2. sorunun bir çözümü
	(Not: Çözüm çalışma sorusunun verildiği tarihte işlenmiş olan konulara göre yazılmıştır)
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{		
		SumFactorsTest.run();
	}
}

class SumFactorsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			
			if (a == 0)
				break;
			
			System.out.printf("%d sayısının kendisi hariç tüm çarpanları toplamı:%d%n", a, NumberUtil.sumFactors(a));
					
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int sumFactors(int a)
	{
		if (a == 1)
			return 1;
		
		int result = 0;
		int sqrtVal = (int)Math.sqrt(a);
		
		for (int i = 2; i <= sqrtVal; ++i)
			if (a % i == 0)
				result += (i == a / i) ? i : (i + a / i);
		
		return result + 1;
	}	
}