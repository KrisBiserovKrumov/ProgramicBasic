package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolarSystem3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String planet = reader.readLine();
        double days = Double.parseDouble(reader.readLine());

        switch (planet) {
            case "Mercury":
                if (days <= 7) {
                    double dis = 0.61 * 2;
                    double totalDays = dis * 226 + days;
                    System.out.printf("Distance: %.2f%n", dis);
                    System.out.printf("Total number of days: %.2f", totalDays);

                } else {
                    System.out.println("Invalid number of days!");
                }
                break;
            case "Venus":
                if (days <= 14) {
                    double dis = 0.28 * 2;
                    double totalDays = dis * 226 + days;
                    System.out.printf("Distance: %.2f%n", dis);
                    System.out.printf("Total number of days: %.2f", totalDays);
                } else {
                    System.out.println("Invalid number of days!");
                }
                break;
            case "Mars":
                if (days <= 20) {
                    double dis = 0.52 * 2;
                    double totalDays = dis * 226 + days;
                    System.out.printf("Distance: %.2f%n", dis);
                    System.out.printf("Total number of days: %.2f", totalDays);
                } else {
                    System.out.println("Invalid number of days!");
                }
                break;
            case "Jupiter":
                if (days <= 5) {
                    double dis = 4.20 * 2;
                    double totalDays = dis * 226 + days;
                    System.out.printf("Distance: %.2f%n", dis);
                    System.out.printf("Total number of days: %.2f", totalDays);
                } else {
                    System.out.println("Invalid number of days!");
                }
                break;
            case "Saturn":
                if (days <= 3) {
                    double dis = 8.52 * 2;
                    double totalDays = dis * 226 + days;
                    System.out.printf("Distance: %.2f%n", dis);
                    System.out.printf("Total number of days: %.2f", totalDays);
                } else {
                    System.out.println("Invalid number of days!");
                }
                break;
            case "Uranus":
                if (days <= 3) {
                    double dis = 18.21 * 2;
                    double totalDays = dis * 226 + days;
                    System.out.printf("Distance: %.2f%n", dis);
                    System.out.printf("Total number of days: %.2f", totalDays);
                } else {
                    System.out.println("Invalid number of days!");
                }
                break;
            case "Neptune":
                if (days <= 2) {
                    double dis = 29.09 * 2;
                    double totalDays = dis * 226 + days;
                    System.out.printf("Distance: %.2f%n", dis);
                    System.out.printf("Total number of days: %.2f", totalDays);
                } else {
                    System.out.println("Invalid number of days!");
                }
                break;
            default:
                System.out.println("Invalid planet name!");
                break;
        }
    }
}
