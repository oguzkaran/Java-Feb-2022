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
package org.csystem.app.datetime;

public class DateUtilApp {
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

            DateUtil.printDateTR(day, month, year);
            DateUtil.printDateEN(day, month, year);
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
