/*----------------------------------------------------------------------------------------------------------------------
	Aşağıodaki örnekte her bir adımda String dizisinin elemanı olan String referansları elde edilmiştir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		String [] cities = {"ankara", "istanbul", "izmir", "zonguldak"};

		for (String city : cities)
			System.out.println(city);
	}
}