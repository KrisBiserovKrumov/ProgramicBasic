package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateCalories2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sex = reader.readLine();
        double kilo = Double.parseDouble(reader.readLine());
        double meturs = Double.parseDouble(reader.readLine()) * 100;
        double age = Double.parseDouble(reader.readLine());
        String level = reader.readLine();
        double bnmMan = 66 + (13.7 * kilo) + (5 * meturs) - (6.8 * age);
        double bnmFame = 655 + (9.6 * kilo) + (1.8 * meturs) - (4.7 * age);

        if (sex.equals("m")) {
            if (level.equals("very active")) {
                double total = Math.ceil(1.725 * bnmMan);
                System.out.printf("To maintain your current weight you will need %.0f calories per day.", total);
            } else if (level.equals("moderately active")) {
                double total = Math.ceil(1.55 * bnmMan);
                System.out.printf("To maintain your current weight you will need %.0f calories per day.", total);
            } else if (level.equals("lightly active")) {
                double total = Math.ceil(1.375 * bnmMan);
                System.out.printf("To maintain your current weight you will need %.0f calories per day.", total);
            } else  {
                double total = Math.ceil(1.2 * bnmMan);
                System.out.printf("To maintain your current weight you will need %.0f calories per day.", total);
            }
        } else {
            if (level.equals("very active")) {
                double total2 = Math.ceil(1.725 * bnmFame);

                System.out.printf("To maintain your current weight you will need %.0f calories per day.", total2);
            } else  if (level.equals("moderately active")){
                double total2 = Math.ceil(1.55 * bnmFame);

                System.out.printf("To maintain your current weight you will need %.0f calories per day.", total2);
                }else  if (level.equals("sedentary")){
                double total2 = Math.ceil(1.2 * bnmFame);

                System.out.printf("To maintain your current weight you will need %.0f calories per day.", total2);
            }else {
                double total2 = Math.ceil(1.375 * bnmFame);

                System.out.printf("To maintain your current weight you will need %.0f calories per day.", total2);
            }

        }
    }
}
