package SimpleConditions;

import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());

        if (a <= 10 ){
            System.out.println("slow");
        }else if (10 < a && a <= 50){
            System.out.println("average");
        }else if (50 < a && a <= 150){
            System.out.println("fast");
        }else if (150 < a && a <= 1000){
            System.out.println("ultra fast");
        }else {
            System.out.println("extremely fast");
        }
    }
}
