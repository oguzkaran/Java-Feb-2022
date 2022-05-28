/*----------------------------------------------------------------------------------------------------------------------	 
	Derleyici özdeş string sabitleri (string literals) için aynı nesnenin referansını verecek bir kod üretir. Yani bir
	string sabiti ile özdeş kaç tane sabit olursa olsun hepsi için aynı nesnenin referansı elde edilir. Yeniden nesne
	yaratılmaz. Aşağıdaki örnekte yine referans karşılaştırması yapılmıştır. Ancak s1 ve s2'ye atanan string'ler özdeş
	olduğundan aynı adresler tutulmuş olur. Örnek durumu anlatmak için yazılmıştır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{		
		String s1 = "ankara";		
		String s2 = "ankara";
		
		System.out.println(s1 == s2 ? "Aynı yazı" : "Farklı yazılar");
	}
}

