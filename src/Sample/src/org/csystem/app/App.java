/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden int türden bir n sayısı için değer isteyiniz. n elemanlı bir String dizisi
	yaratınız. Bu dizinin her bir elemanını rasgele uzunlukta üretilmiş Türkçe karakterlerden oluşan yazılarla
	doldurunuz. Bu işlemden sonra StringUtil sınıfı içerisinde yazacağınız parametresi ile aldığı int türden bir String
	dizisinin elemanlarını, yine parametresi ile aldığı bir ayraç ile birleştirilmiş bir String'e geri dönen join isimli
	metodu çağırarak sonucu ekrana yazdırınız
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		JoinWithDelimiterApp.run();
	}
}

class JoinWithDelimiterApp {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int count = Integer.parseInt(kb.nextLine());

			if (count <= 0)
				break;

			String [] s = StringUtil.getRandomTextsTR(r, count, 5, 10);

			System.out.println("----------------------------------------------------");
			ArrayUtil.print(s);
			System.out.println(StringUtil.join(s, '-'));
			System.out.println("----------------------------------------------------");
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}
