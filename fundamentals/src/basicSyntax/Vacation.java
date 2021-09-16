package basicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vacation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int persons = Integer.parseInt(reader.readLine());
        String type = reader.readLine();
        String day = reader.readLine();

        double price = 0;

        if (day.equals("Friday")){
            if (type.equals("Students")){
                price += 8.45 * persons;
            }else if (type.equals("Business")){
                price += 10.90 * persons;
            }else if (type.equals("Regular")){
                price += 15 * persons;
            }
        }else if (day.equals("Saturday")){
            if (type.equals("Students")){
                price += 9.80 * persons;
            }else if (type.equals("Business")){
                price += 15.60 * persons;
            }else if (type.equals("Regular")){
                price += 20 * persons;
            }
        }else if (day.equals("Sunday")){
            if (type.equals("Students")){
                price += 10.46 * persons;
            }else if (type.equals("Business")){
                price += 16 * persons;
            }else if (type.equals("Regular")){
                price += 22.50 * persons;
            }
        }

        if (persons >= 30 && type.equals("Students")){
            price *= 0.85;
        }if (type.equals("Regular") && persons >= 10 && persons <= 20){
            price *= 0.95;
        }if (type.equals("Business") && persons >= 100){
            price -= (price / persons) * 10;
        }
        System.out.printf("Total price: %.2f" , price);

    }
}
