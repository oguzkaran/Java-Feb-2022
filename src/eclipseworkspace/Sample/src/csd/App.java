/*----------------------------------------------------------------------------------------------------------------------
	Tür (type): Bir değişken için bellekte ne kadar ayrılacağını ve içerisindeki hangi yöntemle tutulacağını belirten
	kavramdır
	
	Java'da türler genel olarak iki gruba ayrılabilir: 
	Temel türler (primitive/built-in/predefined types), programcının tanımladığı türler (user defined types)
	
	Her temel ismi bir anahtar sözcüktür
	
	Temel türler
	
	Tür ismi			Uzunluğu (byte)
	short 					2
	int						4
	long					8
	byte					1
	
	float					4
	double					8
	
	char					2
	boolean					-
	
	Anahtar Notlar:
	- Java'da türlerin uzunlukları boolean türü dışında sistemden sisteme değişmez. 
	- Tamsayı türleri (integer/integral types) için ikiye tümleme yöntemi kullanılır
	- Tüm tamsayı türleri işaretlidir (signed)
	- int türüne "integer" demek yanlış bir terim kullanmak demektir.
	- Gerçek sayı (real/floating point types) için "IEEE 754 standardı" kullanılır
	- boolean türünün alabileceği iki tane değer vardır: true, false. boolean türünün uzunluğu "Java Language Specification"'da 
	belirtilmemiştir. Sistemden sisteme değişebilir. Ancak bu değişim programcı açısından problem oluşturmaz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		System.out.println("Hello, World");
		Sample.foo();
		Sample.bar();
		Mample.tar();
		System.out.println("Goodbye, World");
	}
}

class Sample {
	public static void foo()
	{
		System.out.println("Sample.foo");
		Mample.tar();
	}
	
	public static void bar()
	{
		System.out.println("Sample.bar");
		foo();
	}
}

class Mample {
	public static void tar()
	{
		System.out.println("Mample.tar");
	}
}

