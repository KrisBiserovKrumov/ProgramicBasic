package SimpleConditions;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        if (a == b && b == c ){
            System.out.println("yes");
        }else
            System.out.println("no");
    }
}
