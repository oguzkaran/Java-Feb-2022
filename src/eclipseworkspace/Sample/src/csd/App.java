/*----------------------------------------------------------------------------------------------------------------------	 
	 Aşağıdaki örnekte rasgele üretilen ilk 10 sayının dizilimi her çalıştırmada farklı olur. İlk 10 sayının diziliminin
	 aynı gelme olasılığı çok düşüktür. İkinci üretilen 10 sayı klavyeden alınan tohum değerine göre üretilir. Bu durumda
	 örneğin her çalıştırmada tohum değeri 100 olarak girilirse ikinci 10 sayının dizilimi hep aynı olacaktır. Kodu 
	 çalıştırıp sonucu gözlemleyiniz 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		RandomPointGeneratorApp.run();
	}
}


class RandomPointGeneratorApp {
	public static void run()
	{
		java.util.Random r = new java.util.Random();
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		
		for (;;) {
			System.out.print("Kaç tane nokta üretilsin:");
			int count = Integer.parseInt(kb.nextLine());
			
			if (count <= 0)
				break;
			
			System.out.print("Minimun değeri giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			
			System.out.print("Maksimum değeri giriniz:");
			int b = Integer.parseInt(kb.nextLine());
			
			System.out.println("-----------------------------------------------");
			for (int i = 0; i < count; ++i) {
				Point p = RandomPointGenerator.randomPoint(r, a, b);
			
				p.print();
			}
			
			System.out.println("-----------------------------------------------");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class RandomPointGenerator {
	//...
	public static Point randomPoint(java.util.Random r, int a, int b)
	{
		Point p = new Point();
		
		p.x = r.nextInt(a, b + 1);
		p.y = r.nextInt(a, b + 1);		
		
		return p;
	}
}


class Point {
	public int x;
	public int y;
	
	//...
	
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
