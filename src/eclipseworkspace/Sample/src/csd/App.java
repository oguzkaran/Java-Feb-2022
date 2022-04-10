/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin aşağıdaki açıklamalara
	göre haftanın hangi gününe geldiğini döndüren getDayOfWeek isimli metodu yazınız ve aşağıdaki kod ile test ediniz.
	Açıklamalar:
		- Metot geçersiz bir tarih durumunda -1 değerine geri dönecektir
		- Haftanın günü 1.1.1900 ile verilen tarih arasındaki (verilen tarih dahil) gün sayısının 7(yedi) ile bölümünden 
		elde edilen kalan ile belirlenebilir. Buna göre değer sıfır ise "pazar", 1 ise "pazartesi", ..., 6 ise "cumartesi"
		günlerine karşılık gelir
		
		- 1.1.1900 öncesindeki tarihler geçersiz sayılacaktır
		- getDayOfWeek metodu ile birlikte 
				
		- İleride daha iyisi yazılacaktır parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin
		hafta sonu olup olmadığınıu test eden isWeekend ve hafta içi olup olmadığını test eden isWeekday metotlarını yazınız.
		Bu iki metot tarih geçerlilik kontrolü yapmayacaktır
		
		- İleride daha yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{	
		GetDayOfWeekTest.run();		
	}
}

class GetDayOfWeekTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Gün ay ve yıl bilgilerini giriniz?");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			if (day == 0)
				break;
			
			int dayOfWeek = DateUtil.getDayOfWeek(day, month, year);		
			
			if (dayOfWeek != -1)
				System.out.printf("%02d/%02d/%04d tarihi haftanın %d. günüdür%n", day, month, year, dayOfWeek);
			else
				System.out.println("Geçersiz tarih");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class DateUtil {
	public static int getDayOfWeek(int day, int month, int year)
	{
		//TODO:
	}
	
	
	public static int getDayOfYear(int day, int month, int year)
	{
		if (!isValidDate(day, month, year))
			return -1;
		
		int totalDays = day;
		
		switch (month - 1) {
		case 11:
			totalDays += 30;
		case 10:
			totalDays += 31;
		case 9:
			totalDays += 30;
		case 8:
			totalDays += 31;
		case 7:
			totalDays += 31;
		case 6:
			totalDays += 30;
		case 5:
			totalDays += 31;
		case 4:
			totalDays += 30;
		case 3:
			totalDays += 31;
		case 2:
			totalDays += 28;
			if (isLeapYear(year))
				++totalDays;
		case 1:
			totalDays += 31;			
		}
		
		return totalDays;
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{		
		return  1 <= day && day <= 31 && 1 <= month && month <= 12 && day <= getDays(month, year);		
	}
	
	public static int getDays(int month, int year)
	{
		int days;
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			if (isLeapYear(year))
				++days;
			break;
		default:
			days = 31;
		}
		
		return days;
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}
