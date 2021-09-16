package ComplexCalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FruitShop {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String product = reader.readLine();
        String day = reader.readLine();
        double quantity = Double.parseDouble(reader.readLine());
        boolean IsWeekDay = (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday"));
        boolean IsWeekend = day.equals("Saturday") || day.equals("Sunday");
        boolean flag = false;

        if (product.equals("banana")) {
            if (IsWeekend) {
                System.out.println(quantity * 2.70);
            } else if (IsWeekDay){
                System.out.println(quantity * 2.50);
            }
            }else if (product.equals("apple")) {
                if (IsWeekend) {
                    System.out.println(quantity * 1.25);
                } else if (IsWeekDay){
                    System.out.println(quantity * 1.20);
                }
            } else if (product.equals("orange")) {
            if (IsWeekend) {
                System.out.println(quantity * 0.90);
            } else if (IsWeekDay){
                System.out.println(quantity * 0.85);
            }
            } else if (product.equals("grapefruit")) {
            if (IsWeekend) {
                System.out.println(quantity * 1.60);
            } else if (IsWeekDay){
                System.out.println(quantity * 1.45);
            }
            } else if (product.equals("kiwi")) {
            if (IsWeekend) {
                System.out.println(quantity * 3.00);
            } else if (IsWeekDay){
                System.out.println(quantity * 2.70);
            }
            } else if (product.equals("pineapple")) {
            if (IsWeekend) {
                System.out.println(quantity * 5.60);
            } else if (IsWeekDay){
                System.out.println(quantity * 5.50);
            }
            } else if (product.equals("grapes")) {
        if (IsWeekend) {
            System.out.println(quantity * 4.20);
        } else if (IsWeekDay){
            System.out.println(quantity * 3.85);
        }
        }else {
            System.out.println("error");
            flag = true;
        }
        if ((!IsWeekend || !IsWeekDay) && !flag){
            System.out.println("error");
        }
    }
}
