package ExamPreparation;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shopping {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double baget = Double.parseDouble(reader.readLine());
        double chocolate = Double.parseDouble(reader.readLine());
        double milk = Double.parseDouble(reader.readLine());

        double priceChocolate = chocolate * 0.65;
        double priceMilk = milk * 2.70;
        double Mandarins = Math.floor(chocolate - (chocolate * 0.35));
        double priceMandarins = Mandarins * 0.20;
         double totalPrice = priceChocolate + priceMilk + priceMandarins;
         double diferents = Math.abs(baget - totalPrice);
         if (totalPrice <= baget){
             System.out.printf("You got this, %.2f money left!", diferents);
         }else {
             System.out.printf("Not enough money, you need %.2f more!", diferents);
         }

    }
}
