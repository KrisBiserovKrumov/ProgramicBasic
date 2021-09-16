package SimpleLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LillyE {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double  age = Double.parseDouble(reader.readLine());
        double  price = Double.parseDouble(reader.readLine());
        double  priceToy = Double.parseDouble(reader.readLine());
        double total = 0;
        double total2 = 0;
        double sum = 10;


        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0){
                total = total + sum - 1;
                sum = sum + 10;
                }else {
                total2++;
            }

        }
        double totalMoney = total + total2 * priceToy;
        if (price <= totalMoney){
            System.out.printf("Yes! %.2f", totalMoney - price);
        }else {
            System.out.printf("No! %.2f" , price - totalMoney);
        }

    }
}
