package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreditSystem {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(reader.readLine());
        double Grape = 0;
        double totalCredits = 0;

        for (int i = 0; i < n ; i++) {
            double creditGrape = Double.parseDouble(reader.readLine());
            double grape = creditGrape % 10;
            Grape += grape / n;
            double credits = (creditGrape - grape) /10;


            if (grape == 2){
                credits = credits * 0;
            }else if (grape == 3){
                credits = credits * 0.50;
            }else if (grape == 4){
                credits = credits * 0.70;
            }else if (grape == 5){
                credits = credits * 0.85;
            }else {
                credits = credits * 1;
            }
            totalCredits = totalCredits + credits;
            }

        System.out.printf("%.2f%n", totalCredits);
        System.out.printf("%.2f", Grape);

    }
}
