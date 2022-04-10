/*----------------------------------------------------------------------------------------------------------------------	 
	Programcı ne zaman switch expression, ne zaman switch statement kullanmalıdır? Şüphesiz programcı Java 12 öncesinde
	çalışıyorsa switch expression kullanamaz. Bu durumda programcı zorunlu olmadıkça, okunabilirlik açısından bir sorun da yoksa
	switch expression tercih etmelidir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{		
		MenuApp.run();
	}
}

class MenuApp {
	public static void run()
	{
		Menu.run();
	}
}

class Menu {
	public static void printMenu() 
	{
		System.out.println("1.Ekle");
		System.out.println("2.Güncelle");
		System.out.println("3.Sil");
		System.out.println("4.Listele");
		System.out.println("5. Çıkış");
		System.out.print("Seçenek:");
	}
	
	public static void doWorkForInsert()
	{
		System.out.println("------------------------------------");
		System.out.println("\"Ekle\" seçildi");
		System.out.println("------------------------------------");
	}
	
	public static void doWorkForUpdate()
	{
		System.out.println("------------------------------------");
		System.out.println("\"Güncelle\" seçildi");
		System.out.println("------------------------------------");
	}
	
	public static void doWorkForDelete()
	{
		System.out.println("------------------------------------");
		System.out.println("\"Sil\" seçildi");
		System.out.println("------------------------------------");
	}
	
	public static void doWorkForList()
	{
		System.out.println("------------------------------------");
		System.out.println("\"Listele\" seçildi");
		System.out.println("------------------------------------");
	}
	
	public static void doWorkForQuit()
	{
		System.out.println("------------------------------------");
		System.out.println("Teşekkürler");
		System.out.println("C ve Sistem Programcıları Derneği");
		System.out.println("Tekrar yapıyor musunuz?");
		System.out.println("------------------------------------");
		System.exit(0);
	}
	
	
	public static void doWorkFor(int option)
	{
		switch (option) {
		case 1 -> doWorkForInsert();			
		case 2 -> doWorkForUpdate();
		case 3 -> doWorkForDelete();			
		case 4 -> doWorkForList();			
		case 5 -> doWorkForQuit();
		default -> System.out.println("\"Geçersiz seçenek\"");
		}		
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			printMenu();			
			doWorkFor(Integer.parseInt(kb.nextLine()));
		}		
	}
}
