/*----------------------------------------------------------------------
	FILE        : Circle.java
	AUTHOR      : Java-Feb-2022 Group
	LAST UPDATE : 17.07.2022

	Circle class that represents a circle

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math.geometry;

public class Circle {
    private double m_r;

    public Circle()
    {
    }

    public Circle(double r)
    {
        setRadius(r);
    }

    public double getRadius()
    {
        return m_r;
    }

    public void setRadius(double r)
    {
        m_r = Math.abs(r);
    }

    public double getArea()
    {
        return Math.PI * m_r * m_r;
    }

    public double getCircumference()
    {
        return 2 * Math.PI * m_r;
    }
}
