/*----------------------------------------------------------------------------------------------------------------------	 
	Homework-003-3. sorunun bir çözümü
	(Not: Çözüm çalışma sorusunun verildiği tarihte işlenmiş olan konulara göre yazılmıştır) 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		CalculateDigitalRootTest .run();
	}
}

class CalculateDigitalRootTest {
	public static void run()
	{
		for (int i = 1; i < 40000; ++i)
			System.out.printf("%d sayısının basamaksal kökü:%d%n", i, NumberUtil.calculateDigitalRoot(i));
	}
}



class NumberUtil {
	public static int calculateDigitalRoot(int a)
	{
		int root = Math.abs(a);
		
		while (root > 9)
			root = digitsSum(root);		
		
		return root;
	}
	
	public static int digitsSum(int val)
	{
		int sum = 0;
		
		while (val != 0) {
			sum += val % 10;
			val /= 10;
		}
		
		return sum;
	}
	
	
}