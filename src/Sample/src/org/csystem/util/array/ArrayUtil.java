/*----------------------------------------------------------------------
	FILE        : ArrayUtil.java
	AUTHOR      : Java-Feb-2022 Group
	LAST UPDATE : 18.06.2022

	Utility class for array operations

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.array;

import java.util.Random;

public class ArrayUtil {
    public static void fillRandomArray(Random r, int [] a, int min, int max) //[min, max]
    {
        for (int i = 0; i < a.length; ++i)
            a[i] = r.nextInt(min, max + 1);
    }

    public static int [] getRandomArray(Random r, int count, int min, int max) //[min, max]
    {
        int [] a = new int[count];

        fillRandomArray(r, a, min, max);

        return a;
    }

    public static void print(int [] a)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%d ", a[i]);

        System.out.println();
    }

    public static void reverse(int [] a)
    {
        //TODO:
    }

    public static int sum(int [] a)
    {
        int total = 0;

        for (int i = 0; i < a.length; ++i)
            total += a[i];

        return total;
    }

    public static void swap(int [] a, int i, int k)
    {
        int temp =  a[i];
        a[i] = a[k];
        a[k] = temp;
    }
}
