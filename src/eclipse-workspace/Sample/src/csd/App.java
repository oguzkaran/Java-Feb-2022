/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Katsayıları klavyeden girilen ikinci dereceden bir denklemin köklerini bulup ekrana yazdıran
	programı yazınız. 
	
	Sınıfın aşağdaki kullanım şekli sınıfların yararı 100 birim düşünülürse %1 civarındadır. Örnek farklı yaklaşımlarla da
	yazılabilir. Sınıfın kullanımını göstermek için yazılmıştır. İleride daha iyisi yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		EquationSolverApp.run();
	}
}

class EquationSolverApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.println("İkinci dereceden denklemin katsayılarını giriniz:");
		System.out.print("a?");
		double a = Double.parseDouble(kb.nextLine());
		
		System.out.print("b?");
		double b = Double.parseDouble(kb.nextLine());
		
		System.out.print("c?");
		double c = Double.parseDouble(kb.nextLine());
		
		RootInfo ri = EquationSolver.findRoots(a, b, c);
		
		if (ri.exists)
			System.out.printf("x1 = %f, x = %f%n", ri.x1, ri.x2);
		else
			System.out.println("Geçerk kök yok");
	}
}

class RootInfo {
	public double x1, x2;
	public boolean exists;
}


class EquationSolver {	
	public static double getDelta(double a, double b, double c)
	{
		return b * b - 4 * a * c;
	}
	
	public static RootInfo findRoots(double a, double b, double c)	
	{
		double delta = getDelta(a, b, c);
		RootInfo ri = new RootInfo();
		
		if (delta >= 0) {
			double sqrtDelta = Math.sqrt(delta);		
			ri.x1 = (-b + sqrtDelta) / (2 * a);
			ri.x2 = (-b - sqrtDelta) / (2 * a);
			ri.exists = true;
		}
		
		return ri;			
	}
}

