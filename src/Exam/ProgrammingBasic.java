package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgrammingBasic {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double loze = Double.parseDouble(reader.readLine());
        double grozde = Double.parseDouble(reader.readLine());
        double litursVino = Double.parseDouble(reader.readLine());
        double worker = Double.parseDouble(reader.readLine());

        double totalGrozde = loze * grozde;
        double totalLiturs = 0.40 * totalGrozde / 2.5;
         if (totalLiturs >= litursVino){
             double rest = totalLiturs - litursVino;
             double vinoPerPurson = rest / worker;
             System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", totalLiturs);
             System.out.printf("%.0f liters left -> %.0f liters per person.", rest,vinoPerPurson);
         }else {
             double rest = Math.floor(litursVino - totalLiturs);
             System.out.printf("It will be a tough winter! More %.0f liters wine needed.",rest);
         }

    }
}
