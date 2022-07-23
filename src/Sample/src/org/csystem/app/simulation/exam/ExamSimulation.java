package org.csystem.app.simulation.exam;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ExamSimulation {
    private String m_lectureName;
    private int [][] m_grades;
    private double [] m_averages;
    private double m_average;

    private void fillGrades()
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        System.out.printf("%s sınavına girecek şube sayısını giriniz:", m_lectureName);
        m_grades = new int[Integer.parseInt(kb.nextLine())][];
        m_averages = new double[m_grades.length];

        for (int i = 0; i < m_grades.length; ++i) {
            System.out.printf("%d.şubenin öğrenci sayısını giriniz:", i + 1);
            int count = Integer.parseInt(kb.nextLine());

            m_grades[i] = ArrayUtil.getRandomArray(r, count, 0, 100);
        }
    }

    private void findAverages()
    {
        int totalNumberOfStudents = 0;
        int totalGrades = 0;

        for (int i = 0; i < m_grades.length; ++i) {
            int total = ArrayUtil.sum(m_grades[i]);

            m_averages[i] = (double)total / m_grades[i].length;
            totalGrades += total;
            totalNumberOfStudents += m_grades[i].length;
        }

        m_average = (double)totalGrades / totalNumberOfStudents;
    }

    public ExamSimulation(String name)
    {
        m_lectureName = name;
    }

    public String getLectureName()
    {
        return m_lectureName;
    }

    public int getGrade(int i, int k)
    {
        return m_grades[i][k];
    }

    public double getClassAverage(int i)
    {
        return m_averages[i];
    }

    public double getAverage()
    {
        return m_average;
    }

    public void run()
    {
        fillGrades();
        findAverages();
    }

    public void printGrades()
    {
        System.out.printf("%s dersi sınav notları:%n", m_lectureName);
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < m_grades.length; ++i) {
            System.out.printf("%d.şubenin notları:", i + 1);
            ArrayUtil.print(3, m_grades[i]);
        }
        System.out.println("--------------------------------------------------------------------------");
    }

    public void printAverages()
    {
        System.out.printf("%s dersi için not ortalamaları:%n", m_lectureName);
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < m_averages.length; ++i)
            System.out.printf("%d.şubenin not ortalaması:%f%n", i + 1, m_averages[i]);

        System.out.printf("Okul ortalaması:%f%n", m_average);
        System.out.println("--------------------------------------------------------------------------");
    }

    public void printReport()
    {
        System.out.println("###############################################################################");
        printGrades();
        printAverages();
        System.out.println("###############################################################################");
    }
}
