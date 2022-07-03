/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Bir okulda Matematik sınaı ortak olarak yapılıyor olsun. Kaç şube ve herbir şubede kaç öğrenci olduğu
	bilgisi klavyeden alınsın: Öğrencilerin notları rasgele belirlensin. Tüm bu işlemlerden sonra Matamatik sınavı için
	herbir şubenin ayrı ayrı not ortalamaları ile okulun not ortalamasını bulan simülasyonu yazınız.
	Açıklamalar:
		- Notlar int türü ile tutulacaktır
		- Programı mümkün olduğunca nesne yönelimli ve genel düşünerek yazınız
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		int [][][] a;

		a = new int[3][4][5];

		for (int i = 0; i < a.length; ++i)
			for (int j = 0; j < a[i].length; ++j)
				for (int k = 0; k < a[i][j].length; ++k)
					a[i][j][k] = i + j + k;

		//...
	}
}

