/*----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Parametresi ile aldığı int türden bir dizinin elemanlarının toplamına geri dönen sum misimli metodu
	ArrayUtil sınıfı içersinde yazınız ve aşağıdaki kod ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;
import static org.csystem.util.array.ArrayUtil.*;

class App {
	public static void main(String [] args)
	{
		SumIntArrayTest.run();
	}	
}

class SumIntArrayTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		System.out.print("Birinci sayıyı giriniz:");
		int a = kb.nextInt();

		System.out.print("İkinci sayıyı giriniz:");
		int b = kb.nextInt();

		for (;;) {
			System.out.print("Dizinin eleman sayısını giriniz:");
			int count = kb.nextInt();

			if (count <= 0)
				break;

			int [] numbers = new int[count];

			print(numbers);
			System.out.printf("Toplam:%d%n", sum(numbers));
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}
