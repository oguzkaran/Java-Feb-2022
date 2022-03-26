/*----------------------------------------------------------------------------------------------------------------------	 
	 Sınıf Çalışması: Klavyeden sıfır girilene kadar alınan sayıların pozitif ve negatif olanlarının ayrı ayrı toplamını 
	 bulan programı yazınız. Programda hiç negatif veya pozitif sayı girilmemişse uygun mesajlar verilmelidir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("Sayıları girmeye başlayınız:");
		
		int sum = 0;
		int val;
		
		System.out.print("Bir sayı giriniz:");
		while ((val = Integer.parseInt(kb.nextLine())) != 0) {
			sum += val;
			System.out.print("Bir sayı giriniz:");
		}
				
		System.out.printf("Toplam:%d%n", sum);
	}
}

