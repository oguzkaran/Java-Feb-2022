/*----------------------------------------------------------------------
	FILE        : Point.java
	AUTHOR      : Java-Feb-2022 Group
	LAST UPDATE : 12.06.2022

	Point class that represents a 2 dimensional point in Cartesian plane

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math.geometry;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class Point {
	public int x;
	public int y;
	
	public Point()
	{		
	}
	
	public Point(int a)
	{
		x = a;
	}
	
	public Point(int a, int b)
	{
		x = a;
		y = b;
	}
	
	public double distance()
	{
		return distance(0, 0);		
	}
	
	public double distance(Point other)
	{
		return distance(other.x, other.y);				
	}
	
	public double distance(int a, int b)
	{
		return sqrt(pow(x - a, 2) + pow(y - b, 2));
	}	
	
	public void offset(int dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(int dx, int dy)
	{
		x += dx;
		y += dy;
	}
	
	public String toString()
	{
		return String.format("(%d, %d)", x, y);
	}
}

