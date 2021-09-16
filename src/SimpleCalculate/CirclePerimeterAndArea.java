package SimpleCalculate;

import java.util.Scanner;

public class CirclePerimeterAndArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = Double.parseDouble(scan.nextLine());
        System.out.printf("area = %f%n", Math.PI * r * r);
        System.out.printf("perimeter = %f", 2 * Math.PI * r);
    }
}

