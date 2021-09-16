package SimpleCalculate;

import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double table = Double.parseDouble(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());

        double areaOne = table * (length + 2 * 0.30)
                * (width + 2 * 0.30);
        double areaTwo = table * (length / 2) * (length / 2);

        double priceDollars =  areaOne * 7 + areaTwo * 9;
        double priceLeva = priceDollars * 1.85;

        System.out.printf("%.2f USD%n", priceDollars);
        System.out.printf("%.2f BGN", priceLeva);
    }
}
