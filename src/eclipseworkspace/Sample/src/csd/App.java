/*----------------------------------------------------------------------------------------------------------------------	 
	 Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının Armstrong sayısı olup olmadığını test eden isArmstrong 
	 isimli metodu NumberUtil sınıfı içerisinde yazınız.
	 
	 Açıklamalar:
	 - Bir sayının her basamağının basamak sayıncı kuvvetleri toplandığında sayının kendisine eşitse bu sayıya Armstrong
	 sayısı denir. Örneğin:
	 
	 153 -> 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3 = 153
	 
	 - Kuvvet alma işlemi için yazılmış olan pow metodunu kullanınız
	 
	 - Sayı negatif ise Armstrong sayısı kabul etmeyiniz
	 
	 - Metodu, 1 basamaklı, 2 basamaklı, 3 basamaklı, 4 basamaklı, 5 basamaklı ve 6 basamaklı Armstrong sayılarını
	 ekrana yazdırarak test ediniz	 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		CountDigitsTest.run();
	}
}

class CountDigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
			
			System.out.printf("%d sayısının basamak sayısı:%d%n", val, NumberUtil.countDigits(val));
			
			if (val == 0) {
				System.out.println("Tekrar yapıyor musunuz?");
				return;
			}
		}		
	}
}

class NumberUtil {
	public static int countDigits(int val)
	{
		int count = 0;
		
		do {
			++count;
			val /= 10;
			
		} while (val != 0);		
				
		return count;
	}
}
