/*----------------------------------------------------------------------
	FILE        : Point.java
	AUTHOR      : Java-Feb-2022 Group
	LAST UPDATE : 17.07.2022

	Point class that represents a 2 dimensional point in Cartesian plane

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math.geometry;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
	private int m_x;
	private int m_y;
	
	public Point()
	{		
	}
	
	public Point(int x)
	{
		m_x = x;
	}
	
	public Point(int x, int y)
	{
		m_x = x;
		m_y = y;
	}

	public int getX()
	{
		return m_x;
	}

	public void setX(int x)
	{
		m_x = x;
	}

	public int getY()
	{
		return m_y;
	}

	public void setY(int y)
	{
		m_y = y;
	}

	public double distance()
	{
		return distance(0, 0);		
	}
	
	public double distance(Point other)
	{
		return distance(other.m_x, other.m_y);
	}
	
	public double distance(int x, int y)
	{
		return sqrt(pow(m_x - x, 2) + pow(m_y - y, 2));
	}	
	
	public void offset(int dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(int dx, int dy)
	{
		m_x += dx;
		m_y += dy;
	}
	
	public String toString()
	{
		return String.format("(%d, %d)", m_x, m_y);
	}
}

