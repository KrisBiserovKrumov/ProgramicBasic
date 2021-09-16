package SimpleCalculate;

import java.util.Scanner;

public class ExamenOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double p = Double.parseDouble(scan.nextLine());

double p1 =  x * y * h ;
double liters = p1 * 0.001;
double purcent = p * 0.01;
double total = liters * (1 - purcent);
        System.out.printf("%.3f" ,total);



    }
}
