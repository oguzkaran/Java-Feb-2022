/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı en fazla üç basamaklı bir sayının Türkçe okunuşunu döndüren numToText3DigitsTR
	isimli metodu NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	Açıklamalar:
		- Metot 3 basamaktan büyük sayı kontrolü yapmayacaktır
		- Örnekler:
				123		-> yüzyirmiüç
				-123	-> eksiyüzyirmiüç
				203		-> ikiyüzüç
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.numeric.NumberUtil;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		NumToText3DigitsTRTest.run();
	}
}

class NumToText3DigitsTRTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		System.out.print("Bir sayı giriniz:");
		int count = Integer.parseInt(kb.nextLine());

		for (int i = 0; i < count; ++i) {
			int val = r.nextInt(-999, 1000);
			String fmt = (val < 0 ? "-%03d " : " %03d ") +  " -> %s%n";
			System.out.printf(fmt, Math.abs(val), NumberUtil.numToText3DigitsTR(val));
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}
