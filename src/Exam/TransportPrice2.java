package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TransportPrice2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(reader.readLine());
        String dayNight = reader.readLine();
        double task = 0.70;
        double price = 0;

        if (n < 20) {
            if (dayNight.equals("day")) {
                price += 0.79;
            } else {
                price += 0.90;
            }
            System.out.printf("%.2f",task + price * n);
        }
        else if (n >=20 && n < 100){
            System.out.printf("%.2f",0.09 * n);
        }
        else{
            double cost = 0.06 *n;
            System.out.printf("%.2f",cost);
        }
    }
}
