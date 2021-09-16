package SimpleConditions;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grande = Double.parseDouble(scan.nextLine());
        if (grande >=5.5) {
            System.out.println("Excellent!");
        }
    }
}
