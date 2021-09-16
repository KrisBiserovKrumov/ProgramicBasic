package SimpleCalculate;

import java.util.Scanner;

public class CelsiusToFaren {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double C =Double.parseDouble (scan.nextLine());
        Double area = C*1.8 + 32;

        System.out.printf("%.2f",area);
    }
}
