/*----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Parametresi ile aldığı int türden bir dizinin elemanları ters yüz eden reverse isimli metodu
	başka bir dizi kullanmadan yazınız ve aşağıdaki kod ile tes ediniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;
import static org.csystem.util.array.ArrayUtil.*;

class App {
	public static void main(String [] args)
	{
		ReverseArrayTest.run();
	}	
}

class ReverseArrayTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		for (;;) {
			System.out.print("Dizinin eleman sayısını giriniz:");
			int count = kb.nextInt();

			if (count <= 0)
				break;

			int [] a = getRandomArray(r, count, 0, 99);

			print(a);
			reverse(a);
			print(a);
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}
