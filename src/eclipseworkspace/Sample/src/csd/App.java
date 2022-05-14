/*----------------------------------------------------------------------------------------------------------------------	 
	Random sınıfında Java 17 ile birlikte dolaylı olarak iki tane int türden parametreli bir nextInt metodu da vardır.
	Anahtar Notlar: Java 17 ile birlikte RandomGenerator denilen bir arayüz (interface) eklenmiştir. Random sınıfı da 
	bu arayüzü desteklemektedir (implements). Bu arayüzle birlikte bir çok yeni meotot da Random sınıfına eklenmiştir.
	Arayüz kavramı ve anlatılan kısımların detayları ileride ele alınacaktır. Şu an için bu metotların Random sınıfına
	ait olduğunun bilinmesi yeterlidir 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		java.util.Random r = new java.util.Random();
		
		for (int i = 0; i < 10; ++i)
			System.out.printf("%d ", r.nextInt(10, 21)); //[10, 21)
		
		System.out.println();
	}
}


