package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SoftUniCamp4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(reader.readLine());
        double sum = 0;
        double car = 0;
        double bus = 0;
        double smallAuto = 0;
        double bigAuto = 0;
        double train = 0;
        for (double i = 0; i < n; i++) {
            double num = Double.parseDouble(reader.readLine());
             sum += num;
             if (num < 6){
                 car += num;

             }else if (num > 5 && num <= 12){
                 bus += num;


             }else if (num > 12 && num <= 25){
                 smallAuto += num;


             }else if (num > 25 && num <= 40){
                 bigAuto += num;


             }else {
                 train += num;

                 }
             }
        double total1 = (car / sum) * 100;
        double total2 = (bus / sum) * 100;
        double total3 = (smallAuto / sum) * 100;
        double total4 = (bigAuto / sum )* 100;
        double total5 = (train / sum) * 100;


        System.out.printf("%.2f%%%n",total1);
        System.out.printf("%.2f%%%n",total2);
        System.out.printf("%.2f%%%n",total3);
        System.out.printf("%.2f%%%n",total4);
        System.out.printf("%.2f%%%n",total5);
    }
}
