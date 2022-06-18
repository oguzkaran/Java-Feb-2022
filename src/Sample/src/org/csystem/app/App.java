/*----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Parametresi ile aldığı iki tane int türden dizinin birleşiminden oluşan yeni bir dizi referansına
	geri dönen join isimli metodu yazınız ve aşağıdaki kod ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

class App {
	public static void main(String [] args)
	{
		JoinArraysTest.run();
	}
}

class JoinArraysTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		for (;;) {
			System.out.print("Dizilerin eleman sayısını giriniz:");
			int count1 = kb.nextInt();
			int count2 = kb.nextInt();

			if (count1 <= 0 && count2 <= 0)
				break;

			int [] a = getRandomArray(r, count1, 0, 99);
			int [] b = getRandomArray(r, count2, 0, 99);

			print(2, a);
			print(2, b);
			int[] c = join(a, b);
			print(2, c);
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}
