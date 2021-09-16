package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grades {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(reader.readLine());
        double sum = 0;
        double top = 0;
        double topGrade = 0;
        double  between = 0;
        double  betweenGrade = 0;
        double good = 0;
        double goodGrade = 0;
        double fail = 0;
        double failGrade = 0;


        for (int i = 0; i < n; i++) {
            double grade = Double.parseDouble(reader.readLine());
            sum++;
            if (grade >= 5.00){
                top++;
                topGrade += grade;
            }else if (grade >= 4.00 && grade < 5.00){
                between++;
                betweenGrade += grade;
            }else if (grade >= 3.00 && grade < 4.00){
                good++;
                goodGrade += grade;
            }else {
                fail++;
                failGrade += grade;
                }
                }
                double porcentTop = top / sum * 100;
                double porcentbrtween = between / sum * 100;
                double porcentGood = good / sum * 100;
                double porcentFail = fail / sum * 100;

        System.out.printf("Top students: %.2f%%%n", porcentTop);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", porcentbrtween);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", porcentGood);
        System.out.printf("Fail: %.2f%%%n", porcentFail);


        double midGrade = (topGrade + betweenGrade + goodGrade + failGrade) / sum;
        System.out.printf("Average: %.2f%n", midGrade);




    }
}
