/*----------------------------------------------------------------------------------------------------------------------	 
	Yukarıdaki kurallara göre isimsiz paket altında bulunan bir sınıfa başka bir paket içerisinden erişilemez. Nitelikli
	olarak da erişilemez. Yalnızca bu sebepten bile bir projede isimsiz paket altında sınıf bildirilmemelidir 
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {	
	public static void main(String [] args)
	{		
		Sample s = new Sample(); //error
		
		s.foo(45);
		
		System.out.printf("s.a = %d%n", s.a);
	}
}



