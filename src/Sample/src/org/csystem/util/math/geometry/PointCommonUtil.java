/*----------------------------------------------------------------------
	FILE        : PointCommonUtil.java
	AUTHOR      : Java-Feb-2022 Group
	LAST UPDATE : 24.07.2022

	Friendly Utility class for Point and MutablePoint

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math.geometry;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class PointCommonUtil {
    private PointCommonUtil()
    {
    }

    public static double distance(int x1, int y1, int x2, int y2)
    {
        return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
    }

    public static String toString(int x, int y)
    {
        return String.format("(%d, %d)", x, y);
    }
}
