package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ticketsMatch {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double baget = Double.parseDouble(reader.readLine());
        String type = reader.readLine();
        double people = Double.parseDouble(reader.readLine());

        double VIP = 499.99;
        double Normal = 249.99;


        switch (type){
            case"VIP":
                if (people > 0 && people < 5){
                    double tranpost = 0.75 * baget;
                    double total = tranpost + VIP * people;
                    double rest = Math.abs(baget - total);
                    if (total <= baget){
                        System.out.printf("Yes! You have %.2f leva left.", rest);
                    }else{
                        System.out.printf("Not enough money! You need %.2f leva.", rest);
                    }
                }else if (people > 4 && people < 10) {
                    double tranpost = 0.60 * baget;
                    double total = tranpost + VIP * people;
                    double rest = Math.abs(baget - total);
                    if (total <= baget) {
                        System.out.printf("Yes! You have %.2f leva left.", rest);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", rest);
                    }
                }else if (people > 9 && people < 26) {
                        double tranpost = 0.50 * baget;
                        double total = tranpost + VIP * people;
                        double rest = Math.abs(baget - total);
                        if (total <= baget) {
                            System.out.printf("Yes! You have %.2f leva left.", rest);
                        } else {
                            System.out.printf("Not enough money! You need %.2f leva.", rest);
                        }
                    }else if (people > 25 && people < 50) {
                    double tranpost = 0.40 * baget;
                    double total = tranpost + VIP * people;
                    double rest = Math.abs(baget - total);
                    if (total <= baget) {
                        System.out.printf("Yes! You have %.2f leva left.", rest);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", rest);
                    }
                }else  {
                    double tranpost = 0.25 * baget;
                    double total = tranpost + VIP * people;
                    double rest = Math.abs(baget - total);
                    if (total <= baget) {
                        System.out.printf("Yes! You have %.2f leva left.", rest);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", rest);
                    }



                }break;
            case "Normal":
                if (people > 0 && people < 5){
                    double tranpost = 0.75 * baget;
                    double total = tranpost + Normal * people;
                    double rest = Math.abs(baget - total);
                    if (total <= baget){
                        System.out.printf("Yes! You have %.2f leva left.", rest);
                    }else{
                        System.out.printf("Not enough money! You need %.2f leva.", rest);
                    }
                }else if (people > 4 && people < 10) {
                    double tranpost = 0.60 * baget;
                    double total = tranpost + Normal * people;
                    double rest = Math.abs(baget - total);
                    if (total <= baget) {
                        System.out.printf("Yes! You have %.2f leva left.", rest);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", rest);
                    }
                }else if (people > 9 && people < 26) {
                    double tranpost = 0.50 * baget;
                    double total = tranpost + Normal * people;
                    double rest = Math.abs(baget - total);
                    if (total <= baget) {
                        System.out.printf("Yes! You have %.2f leva left.", rest);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", rest);
                    }
                }else if (people > 25 && people < 50) {
                    double tranpost = 0.40 * baget;
                    double total = tranpost + Normal * people;
                    double rest = Math.abs(baget - total);
                    if (total <= baget) {
                        System.out.printf("Yes! You have %.2f leva left.", rest);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", rest);
                    }
                }else  {
                    double tranpost = 0.25 * baget;
                    double total = tranpost + Normal * people;
                    double rest = Math.abs(baget - total);
                    if (total <= baget) {
                        System.out.printf("Yes! You have %.2f leva left.", rest);
                    } else {
                        System.out.printf("Not enough money! You need %.2f leva.", rest);
                    }



                }break;

            }









    }
}
