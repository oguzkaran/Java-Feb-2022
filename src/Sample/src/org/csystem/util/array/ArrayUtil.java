/*----------------------------------------------------------------------
	FILE        : ArrayUtil.java
	AUTHOR      : Java-Feb-2022 Group
	LAST UPDATE : 18.06.2022

	Utility class for array operations

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.array;

public class ArrayUtil {
    public static void print(int [] a)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%d ", a[i]);

        System.out.println();
    }

    public static void swap(int [] a, int i, int k)
    {
        int temp =  a[i];
        a[i] = a[k];
        a[k] = temp;
    }
}
