/*----------------------------------------------------------------------------------------------------------------------	
	Bir metodun parametresi bir dizi referansı olabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import static org.csystem.util.array.ArrayUtil.print;
import static org.csystem.util.array.ArrayUtil.swap;

class App {
	public static void main(String [] args)
	{
		int [] a = {10, 20, 30, 40};

		print(a);
		swap(a, 1, 3);
		print(a);
	}	
}

