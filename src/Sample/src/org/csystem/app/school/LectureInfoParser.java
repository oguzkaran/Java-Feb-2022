package org.csystem.app.school;

import org.csystem.app.datetime.DateUtil;

public class LectureInfoParser {
    public LectureInfo lectureInfo;

    public static String getDateStr(String str)
    {
        String [] dateInfo = str.split("[/]");

        int day = Integer.parseInt(dateInfo[0]);
        int month = Integer.parseInt(dateInfo[1]);
        int year = Integer.parseInt(dateInfo[2]);

        return DateUtil.getDateStrTR(day, month, year);
    }

    public LectureInfoParser(String str)
    {
        /*
        <ad soyad>:<ders adı>:<gg-aa-yyyy>:<gg-aa-yyyy>:<arasınav>:<final>

        Oğuz Karan:Matematik:04/04/2022:01/07/2022:78:67
        Barış Er:Radyo Haberleşmesi:03/04/2022:02/07/2022:89:100
        Ziya ÇAYLAN:PLC Programlama:10/04/2022:13/06/2022:90:98
        Emirhan Kabal:Fizik:07.03.2022:03:07:2022:85:75
        Ozan Yiğit:İstatistik:07/04/2017:19/06/2017:90:100
        Yunus Emre Uslu:Yazlım Geliştirme:28/06/20:60:70
         */

        //...

        String [] lectureInfoStr = str.split("[:]+");

        //...

        lectureInfo = new LectureInfo();
        lectureInfo.studentName = lectureInfoStr[0];
        lectureInfo.lectureName = lectureInfoStr[1];
        lectureInfo.midtermDate = getDateStr(lectureInfoStr[2]);
        lectureInfo.finalDate = getDateStr(lectureInfoStr[3]);
        lectureInfo.midtermGrade = Integer.parseInt(lectureInfoStr[4]);
        lectureInfo.finalGrade = Integer.parseInt(lectureInfoStr[5]);
    }
}

