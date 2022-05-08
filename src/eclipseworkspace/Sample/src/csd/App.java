/*----------------------------------------------------------------------------------------------------------------------	 
	Soru: Bir sınıfın metodunun non-static mi, static mi olduğuna nasıl karar vereceğiz?
	
	Cevap: Bu soru için basit bir kural şu şekilde benimsenebilir: "Bir metot non-static elemanlara doğrudan erişmeyecekse 
	static yapılmalıdır". Bu durumda "non-static bir metot için kesinlikle non-static bir elemana doğrudan erişiyordur" 
	anlamı çıkar. Bu da okunabilirliği artırır. Yani aslında bir metodu yapmak non-static metotların okunabilirliğini
	artırır. Ayrıca non-static metotların sınıf dışında referans ve nokta operatörü ile çağrılması gerektiğinden static
	yapılabilecek olan ancak non-static bir metot boşu boiuna referans ile çağrılmış olur. 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args) 
	{
		
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
		
		EquationSolver.printRoots(a, b, c);		
		
	}
}


class EquationSolver {
	public static void doWorkForDifferentRoots(double delta, double a, double b)
	{
		double x1, x2;
		double sqrtDelta;
		
		sqrtDelta = Math.sqrt(delta);		
		x1 = (-b + sqrtDelta) / (2 * a);
		x2 = (-b - sqrtDelta) / (2 * a);
		
		System.out.printf("x1 = %f, x2 = %f%n", x1, x2);
	}
	
	public static void doWorkForSameRoots(double a, double b)
	{
		double x = -b / (2 * a);
		
		System.out.printf("x1 = x2 = %f%n", x);
	}
	
	public static double getDelta(double a, double b, double c)
	{
		return b * b - 4 * a * c;
	}
	
	public static void printRoots(double a, double b, double c)	
	{
		double delta = getDelta(a, b, c);
		
		if (delta > 0)
			doWorkForDifferentRoots(delta, a, b);
		else if (delta == 0)
			doWorkForSameRoots(a, b);
		else
			System.out.println("Gerçek kök yok");			
	}
}