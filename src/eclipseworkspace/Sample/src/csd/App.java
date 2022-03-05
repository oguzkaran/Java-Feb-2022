/*----------------------------------------------------------------------------------------------------------------------,
	Yukarıdaki kod aşağıdaki gibi bir çözümle daha iyi hale getirilebilir	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		
		System.out.print("İkinci sayıyı giriniz:");
		int b = Integer.parseInt(kb.nextLine());		
		
		System.out.println(NumberUtil.add(a, b));
		
		//...
		
		System.out.println(NumberUtil.add(a, b));			
	}
}

class NumberUtil {
	public static int add(int a, int b)	
	{		
		return a + b;		
	}
}

