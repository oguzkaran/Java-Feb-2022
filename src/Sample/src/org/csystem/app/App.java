/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Aşağıdaki açıklamalara göre getHistogramData isimli metodu yazınız ve test ediniz:
	Açıklamalar:
		- Metot int türden bir dizi ve int türden bir n sayısı alacaktır
			int [] getHistogramData(int [] a, int n)
		- Metot a dizisi içerisinde [0, n] arasındaki sayılardan hangisinin kaç tane olduğunu içeren bir sayaç
		dizisine geri dönecektir

		- Sayaç dizisinin her bir indeks numarsı [0, n] aralığındaki sayıyı temsil edecektir. Yani örneğin sıfır
		numaralı inmdeksteki değer sıfır sayısının kaç tane olduğu bilgisini içerecektir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		PartitionTest.run();
	}
}

class PartitionTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int count = Integer.parseInt(kb.nextLine());

			if (count <= 0)
				break;

			System.out.print("Eşik değerini giriniz:");
			int threshold = Integer.parseInt(kb.nextLine());

			int [] a = ArrayUtil.getRandomArray(r, count, 0, 99);
			System.out.println("---------------------------------------------------------");
			ArrayUtil.print(2, a);
			int partitionPoint = ArrayUtil.partition(a, threshold);

			System.out.printf("Bölümleme Noktası:%d%n", partitionPoint);
			ArrayUtil.print(2, a);
			System.out.println("---------------------------------------------------------");
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

