/*----------------------------------------------------------------------------------------------------------------------	 
	Point sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		Point p1, p2, p3;
		
		p1 = new Point(100, 100);
		p2 = new Point();
		p3 = new Point(400);
		
		
		p1.print();
		p2.print();
		p3.print();		
	}
}


class Point {
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
		return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
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
	
	public void print()
	{
		System.out.printf("(%d, %d)%n", x, y);
	}
}