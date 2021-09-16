package SimpleCalculate;

import java.util.Scanner;

public class Charity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int bakers = Integer.parseInt(scan.nextLine());
        int cakeCount = Integer.parseInt(scan.nextLine());
        int waffleCount = Integer.parseInt(scan.nextLine());
        int pancakeCount = Integer.parseInt(scan.nextLine());

        double cakePrice = 45;
        double wafflePrice = 5.80;
        double pancakePrice = 3.20;

        double cakesPerDay = cakeCount * cakePrice;
        double wafflePerDay = waffleCount * wafflePrice;
        double pancakePerDay = pancakeCount * pancakePrice;

        double dailySum = (cakesPerDay + wafflePerDay + pancakePerDay) * bakers;

        double totalSum = dailySum * days;

        System.out.printf("%.2f", totalSum - totalSum / 8);
    }
}
