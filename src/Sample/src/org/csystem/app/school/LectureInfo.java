package org.csystem.app.school;

public class LectureInfo {
    public String studentName;
    public String lectureName;
    public String midtermDate;
    public String finalDate;
    public int midtermGrade;
    public int finalGrade;

    //...

    public int getGrade()
    {
        return (int)Math.round(midtermGrade * 0.4 + finalGrade * 0.6);
    }

    //...
}
