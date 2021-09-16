package SimpleCalculate;

import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double wiskeyPrice = Double.parseDouble(scan.nextLine());
        double beerAmount = Double.parseDouble(scan.nextLine());
        double wineAmount = Double.parseDouble(scan.nextLine());
        double rakiaAmount = Double.parseDouble(scan.nextLine());
        double wiskeyAmount = Double.parseDouble(scan.nextLine());

        double rakiaPrice = wiskeyPrice / 2;
        double winePrice = rakiaPrice - (rakiaPrice * 0.4);
        double beerPrice = rakiaPrice - (rakiaPrice * 0.8);

        double wiskeyTotal = wiskeyAmount * wiskeyPrice;
        double rakiaTotal = rakiaAmount * rakiaPrice;
        double wineTotal = wineAmount * winePrice;
        double beerTotal = beerAmount * beerPrice;

        double total = wiskeyTotal + rakiaTotal + wineTotal + beerTotal;
        System.out.printf("%.2f", total);
    }
}
