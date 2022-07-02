/*----------------------------------------------------------------------------------------------------------------------
	Homework-007-2. sorunun bir çözümü
	(İleride daha iyisi yazılacaktır)
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.datetime.test;

import org.csystem.app.datetime.DateUtil;

public class PrintRandomDateTest {
    public static void run()
    {
        java.util.Random r = new java.util.Random();
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int count = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < count; ++i)
            DateUtil.printRandomDate(r);
    }
}