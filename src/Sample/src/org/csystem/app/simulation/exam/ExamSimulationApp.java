/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Bir okulda Matematik sınavı ortak olarak yapılıyor olsun. Kaç şube ve herbir şubede kaç öğrenci olduğu
	bilgisi klavyeden alınsın: Öğrencilerin notları rasgele belirlensin. Tüm bu işlemlerden sonra Matamatik sınavı için
	herbir şubenin ayrı ayrı not ortalamaları ile okulun not ortalamasını bulan simülasyonu yazınız.
	Açıklamalar:
		- Notlar int türü ile tutulacaktır
		- Programı mümkün olduğunca nesne yönelimli ve genel düşünerek yazınız
	Not: İleride daha iyisi yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/

package org.csystem.app.simulation.exam;

public class ExamSimulationApp {
    public static void run()
    {
        ExamSimulation mathSimulation = new ExamSimulation("Matematik");
        ExamSimulation chemistrySimulation = new ExamSimulation("Kimya");

        mathSimulation.run();
        chemistrySimulation.run();

        mathSimulation.printReport();
        chemistrySimulation.printReport();
    }
}
