package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class timeMachine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double money = Double.parseDouble(reader.readLine());
        double year = Double.parseDouble(reader.readLine());
        double age = 18;

        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0){
                money = money - 12000;
            }else if (i % 2 == 1){

                money = money - (12000 + (age * 50));

            }
            age++;

        }
        if (money >= 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",money);
        }else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }
    }
}
