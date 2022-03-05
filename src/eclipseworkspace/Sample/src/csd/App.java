/*----------------------------------------------------------------------------------------------------------------------,
	printf metodunda uygun format karakterleri kullanılmadığında genel olarak exception oluşur
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{		
		int a = 10;
		
		System.out.printf("a = %b%n", a);
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

