/*----------------------------------------------------------------------------------------------------------------------
	Circle sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.math.geometry.Circle;

class App {
	public static void main(String [] args)
	{
		Circle c = new Circle(-2.4);

		System.out.printf("Radius:%f%n", c.getRadius());
		System.out.printf("Area:%f%n", c.getArea());
		System.out.printf("Circumference:%f%n", c.getCircumference());

		c.setRadius(4.5);

		System.out.printf("Radius:%f%n", c.getRadius());
		System.out.printf("Area:%f%n", c.getArea());
		System.out.printf("Circumference:%f%n", c.getCircumference());
	}
}

