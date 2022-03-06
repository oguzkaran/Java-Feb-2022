/*----------------------------------------------------------------------------------------------------------------------,
	Neden standart metotları kullanmalıyız? Yani standart metodu yazmalı mıyız?
	Java'da standart olarak (JavaSE) bulunan metotların kullanılmasının bazı önemli avantajları:
	- Okunabilir kodlar yazılır
	- Testleri yapılmıştır ve yeterince erkin olarak yazılmıştır
	- Taşınabilirdir
	- Bazı metotlar (ki bunların sayısı oldukça fazladır) başka detay konuları da bilmeyi gerektirir
	- Programcının projede sadece kendi konusuna odaklanmasını sağlar
	
	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz:");
		double a = Double.parseDouble(kb.nextLine());
		System.out.print("İkinci sayıyı giriniz:");
		double b = Double.parseDouble(kb.nextLine());
		
		double result;
		result = a / b;
		
		System.out.printf("%f / %f = %f%n", a, b, result);
	}
}

