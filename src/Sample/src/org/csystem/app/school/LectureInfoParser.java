package org.csystem.app.school;

import org.csystem.app.datetime.DateUtil;

public class LectureInfoParser {
    private final LectureInfo m_lectureInfo;

    private static String getDateStr(String str)
    {
        String [] dateInfo = str.split("[/]");

        int day = Integer.parseInt(dateInfo[0]);
        int month = Integer.parseInt(dateInfo[1]);
        int year = Integer.parseInt(dateInfo[2]);

        return DateUtil.getDateStrTR(day, month, year);
    }

    public LectureInfoParser(String str)
    {
        //...

        String [] lectureInfoStr = str.split("[:]+");

        //...

        m_lectureInfo = new LectureInfo();
        m_lectureInfo.setStudentName(lectureInfoStr[0]);
        m_lectureInfo.setLectureName(lectureInfoStr[1]);
        m_lectureInfo.setMidtermDate(getDateStr(lectureInfoStr[2]));
        m_lectureInfo.setFinalDate(getDateStr(lectureInfoStr[3]));
        m_lectureInfo.setMidtermGrade(Integer.parseInt(lectureInfoStr[4]));
        m_lectureInfo.setFinalGrade(Integer.parseInt(lectureInfoStr[5]));
    }

    public LectureInfo getLectureInfo()
    {
        return m_lectureInfo;
    }
}

