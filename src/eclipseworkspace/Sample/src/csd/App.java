/*----------------------------------------------------------------------------------------------------------------------	 
	Aşağıdaki koşullar ayrık olmadığında örnek özelinde else-if biçiminde kullanılması yanlış olur
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = Integer.parseInt(kb.nextLine());
		
		if (val > 6)
			System.out.println("val > 6");
		if (val > 11)
			System.out.println("val > 11");
		if (val > 21)
			System.out.println("val > 21");
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


