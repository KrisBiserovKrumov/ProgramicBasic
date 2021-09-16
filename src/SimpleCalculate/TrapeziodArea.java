package SimpleCalculate;

import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double b = Double.parseDouble(scan.nextLine());
        double b1 = Double.parseDouble(scan.nextLine());
        double h= Double.parseDouble(scan.nextLine());
        double area = (b + b1) * h / 2;
        System.out.println(area);
    }
}
