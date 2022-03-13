/*----------------------------------------------------------------------------------------------------------------------	 
	Operatörler: Bir işleme yol açan ve işlem sonucunda bir değer üreten atomlara operatör denir. Operatör ile
	birlikte işleme giren ifadelere "operand" denir.
	
	Operatörleri 3(üç) biçimde sınıflandırılabilir:
	1. İşlevlerine göre sınıflandırma
		- Aritmetik (arithmetic) operatörler
		- Karşılaştırma (comparison) operatörleri
		- Mantıksal (logical) operatörler
		- Bitsel (bitwise) operatörler
		- Özel amaçlı (special purpose) operatörler	
	2. Operand sayısına göre sınıflandırma
		- Tek operandlı (unary)
		- İki operandlı (binary)
		- Üç operandlı (ternary)	
	3. Operatörün ifadedeki konumuna göre sınıflandırma
		- önek (prefix)
		- araek (infix)
		- sonek (postfix)
		
	Operatörün kısıtı (constraint)
	Operatörün ürettiği değer (product value)
	Operatörün yan etkisi (side effect) var mı?
	Operatörün önceliği (precedence):
	
	a = b + c * d ifadesinin derleyici tarafından üretilen kodda yapılma sırası
	
	i1: c * d
	i2: b + i1
	i3: a = i2
	
	a = (b + c) * d ifadesinin derleyici tarafından üretilen kodda yapılma sırası
	
	i1: b + c
	i2: i1 * d
	i3: a = i2	
	
	a = b + c - d ifadesinin derleyici tarafından üretilen kodda yapılma sırası
	
	i1: b + c
	i2: i1 - d
	i3: a = i2
	
	Anahtar Notlar: Java programcısı bir operatör için yukarıdaki durumları bilmelidir. Yani bir operatörün öğrenilmesi
	o operatör için yukarıdaki durumların bilinmesi anlamına gelir.
	
	Anahtar Notlar: Bazı operatörler öncelik kuralına doğrudan uymazlar. Bu tarz operatörlerin de uymadıkları durum için
	nasıl çalıştıklarının bilinmesi gerekir. Şüphesiz bu operatörlerin neden öncelik kurallarına uymadıklarının da 
	gerekçeleri (rationale) bulunur.
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		long divider = 1000L * 60 * 60 * 24 * 365;	//byte code -> long divider = 31536000000;
		
		
		System.out.println(divider);
	}
}


