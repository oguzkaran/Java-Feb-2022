/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Yukarıdaki uygulamanın kullanıcı adını karttan okuyan sadece şifre isteyen versiyonu
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{		
		AtmApp.run(3);
	}
}

class AtmApp {
	
	public static void doSuccess(AtmCard atmCard, java.util.Scanner kb)
	{
		System.out.println("-------------------------");
		System.out.println("Giriş başarılı");
		System.out.println("-------------------------");
		//...
	}
	
	public static void doFail(AtmCard atmCard, java.util.Scanner kb)
	{
		System.out.println("-------------------------");
		System.out.println("Giriş başarısız. Artık deneme hakkınız biti!...");
		System.out.println("-------------------------");
		//...
	}
	
	public static void doWorkForCard(AtmCard atmCard, int tryNum, java.util.Scanner kb)
	{
		int i = 0;
		
		for (; i < tryNum; ++i) {			
			System.out.print("Şifreyi giriniz:");
			String password = kb.nextLine();
			
			if (atmCard.isvalid(password))
				break;
			
			if (i != tryNum - 1)
				System.out.printf("Giriş başarısız. %d giriş hakkınız kaldı!...%n", tryNum - 1 - i);
		}
		
		if (i != tryNum)
			doSuccess(atmCard, kb);
		else
			doFail(atmCard, kb);		
	}
	
	public static void run(int tryNum)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {			
			AtmCard atmCard = new AtmCard(); //Her defasında yeni kart girişi yapılıyor olarak düşününüz
			System.out.printf("Hoş geldiniz %s%n", atmCard.name);
			
			doWorkForCard(atmCard, tryNum, kb);			
		}
	}
}

class AtmCard {
	public String name;
	public String password;
	
	public AtmCard() 
	{
		//Burada kartın içinden okunuyor olarak düşününüz
		name = "Ali Vefa Serçe";
		password = "1993";
	}
	
	public boolean isvalid(String passwd)
	{
		return passwd.equals(password);
	}
	
	//...
}



