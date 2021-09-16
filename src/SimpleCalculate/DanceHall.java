package SimpleCalculate;

import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length = Double.parseDouble(scan.nextLine()) * 100;
        double width = Double.parseDouble(scan.nextLine()) * 100;
        double sideA = Double.parseDouble(scan.nextLine()) * 100;

        double roomSize = length * width;
        double wdSize = sideA * sideA;
        double benchSize = roomSize / 10;

        double freeSpace = (roomSize - wdSize - benchSize) / (7040);

        System.out.printf("%.0f", Math.floor(freeSpace));
    }
}
