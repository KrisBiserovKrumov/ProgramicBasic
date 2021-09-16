package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fitnesscard {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double totalMoney = Double.parseDouble(reader.readLine());
        String gander = reader.readLine();
        double age = Double.parseDouble(reader.readLine());
        String sport = reader.readLine();
        double priceCard = 0;



        if (gander.equals("m")){
            switch (sport) {
                case "Gym" :
                    priceCard += 42;
                    break;
                case "Boxing" :
                    priceCard += 41;
                    break;
                case "Yoga" :
                    priceCard += 45;
                    break;
                case "Zumba" :
                    priceCard += 34;
                    break;
                case "Dances" :
                    priceCard += 51;
                    break;
                case "Pilates" :
                    priceCard += 39;
                    break;
            }
        }else if (gander .equals("f")){
            switch (sport) {
                case "Gym" :
                    priceCard += 35;
                    break;
                case "Boxing" :
                    priceCard += 37;
                    break;
                case "Yoga" :
                    priceCard += 42;
                    break;
                case "Zumba" :
                    priceCard += 31;
                    break;
                case "Dances" :
                    priceCard += 53;
                    break;
                case "Pilates" :
                    priceCard += 37;
                    break;
            }
            }

            if (age <= 19) {
            priceCard = priceCard * (1 - 0.20);
            }

            if (priceCard <= totalMoney) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            }else {
            double total = Math.abs(priceCard - totalMoney);
                System.out.printf("You don't have enough money! You need $%.2f more." ,total);

            }





    }
}
