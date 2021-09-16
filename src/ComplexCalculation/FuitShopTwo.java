package ComplexCalculation;


import java.util.Scanner;

public class FuitShopTwo {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        String friut = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        boolean IsWeekDay = (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday"));
        boolean IsWeekend = day.equals("Saturday") || day.equals("Sunday");

        double price = - 1.0;

        //(banana / apple / orange / grapefruit / kiwi / pineapple /
        //grapes),

        if (IsWeekDay) {
            if (friut.equals("banana")) price = 2.50;
            else if (friut.equals("apple")) price = 1.20;
            else if (friut.equals("orange")) price = 0.85;
            else if (friut.equals("grapefruit")) price = 1.45;
            else if (friut.equals("kiwi")) price = 2.70;
            else if (friut.equals("pineapple")) price = 5.50;
            else if (friut.equals("grapes")) price = 3.85;
        }else if (IsWeekend){
            if (friut.equals("banana")) price = 2.70;
            else if (friut.equals("apple")) price = 1.25;
            else if (friut.equals("orange")) price = 0.90;
            else if (friut.equals("grapefruit")) price = 1.60;
            else if (friut.equals("kiwi")) price = 3;
            else if (friut.equals("pineapple")) price = 5.60;
            else if (friut.equals("grapes")) price = 4.20;
        }else {
            System.out.println("error");
        }
        if (price >= 0) {
            System.out.println(quantity * price);
        }else {
            System.out.println("error");
        }

    }
}
