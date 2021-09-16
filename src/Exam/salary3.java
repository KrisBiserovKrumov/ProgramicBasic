package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class salary3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double age = Double.parseDouble(reader.readLine());
        String  professional = reader.readLine();

        if (professional.equals("C# Developer")) {
            if (age <= 5) {
                double price = (5400 - 0.658 * 5400) * 12;
                System.out.printf("Total earned money: %.2f BGN", price);
            } else {
                double price1 = 5400 * 12;
                System.out.printf("Total earned money: %.2f BGN", price1);
            }
        } else if (professional.equals("Java Developer")) {
            if (age <= 5) {
                double price2 = (5700 - 0.658 * 5700) * 12;
                System.out.printf("Total earned money: %.2f BGN", price2);
            } else {
                double price3 = 5700 * 12;
                System.out.printf("Total earned money: %.2f BGN", price3);
            }
        } else if (professional.equals("Front-End Web Developer")) {
            if (age <= 5) {
                double price4 = (4100 - 0.658 * 4100) * 12;
                System.out.printf("Total earned money: %.2f BGN", price4);
            } else {
                double price5 = 4100 * 12;
                System.out.printf("Total earned money: %.2f BGN", price5);
            }
        } else if (professional.equals("UX / UI Designer")) {
            if (age <= 5) {
                double price6 = (3100 - 0.658 * 3100) * 12;
                System.out.printf("Total earned money: %.2f BGN", price6);
            } else {
                double price7 = 3100 * 12;
                System.out.printf("Total earned money: %.2f BGN", price7);
            }
        } else
            if (age <= 5) {
                double price8 = (3600 - 0.658 * 3600) * 12;
                System.out.printf("Total earned money: %.2f BGN", price8);
            } else {
                double price9 = 3600 * 12;
                System.out.printf("Total earned money: %.2f BGN", price9);
            }

        }

    }



