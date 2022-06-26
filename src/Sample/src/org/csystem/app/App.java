/*----------------------------------------------------------------------------------------------------------------------
	Referans dizileri
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.string.StringUtil;

class App {
	public static void main(String [] args)
	{
		SqueezeTest.run();
	}
}

class SqueezeTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		for (;;) {
			System.out.print("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();

			if ("elma".equals(s1))
				break;

			System.out.print("İkinci yazıyı giriniz:");
			String s2 = kb.nextLine();

			System.out.println(StringUtil.squeeze(s1, s2));
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

