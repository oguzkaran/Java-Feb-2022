/*----------------------------------------------------------------------------------------------------------------------,
	Math sınıfının min ve max metotları ile 3 tane sayının en küçüğünün ve en büyüğünün bulunması
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		
		System.out.print("İkinci sayıyı giriniz:");
		int b = Integer.parseInt(kb.nextLine());
		
		System.out.print("Üçüncü sayıyı giriniz:");
		int c = Integer.parseInt(kb.nextLine());
		
		System.out.printf("min(%d, %d, %d) = %d%n", a, b, c, MathUtil.min(a, b, c));
		System.out.printf("max(%d, %d, %d) = %d%n", a, b, c, MathUtil.max(a, b, c));
	}
}

class MathUtil {
	public static int min(int a, int b, int c)
	{
		return Math.min(Math.min(a, b), c);
		
	}
	
	public static int max(int a, int b, int c)
	{
		return Math.max(Math.max(a, b), c);
		
	}
	
	//...
}