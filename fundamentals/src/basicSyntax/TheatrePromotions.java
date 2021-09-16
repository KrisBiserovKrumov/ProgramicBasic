package basicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheatrePromotions {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String day = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        int price = 0;

        switch (day) {
            case "Weekday":
                if (0 <= age && age <= 18) {
                    price += 12;
                }
                if (18 < age && age <= 64) {
                    price += 18;
                }
                if (64 < age && age <= 122) {
                    price += 12;
                }
                break;

            case "Weekend":
                if (0 <= age && age <= 18) {
                    price += 15;

                }
                if (18 < age && age <= 64) {
                    price += 20;
                }
                if (64 < age && age <= 122) {
                    price += 15;
                }

                break;

            case "Holiday":
                if (0 <= age && age <= 18) {
                    price += 5;
                }
                if (18 < age && age <= 64) {
                    price += 12;
                }
                if (64 < age && age <= 122) {
                    price += 10;
                }
                break;
        }if (price == 0){
            System.out.println("Error!");
        }else {
        System.out.println(price + "$");
        }







    }
}
