package SimpleConditions;

import java.util.Scanner;

public class ThreeBrothers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bigBrother = Double.parseDouble(scan.nextLine());
        double middleBrother = Double.parseDouble(scan.nextLine());
        double littleBrother = Double.parseDouble(scan.nextLine());
        double father = Double.parseDouble(scan.nextLine());

        double cleaningTime = 1 / (1 / bigBrother + 1 / middleBrother
                + 1 / littleBrother);

        cleaningTime = cleaningTime + (cleaningTime * 0.15);

        System.out.printf("Cleaning time: %.2f%n", cleaningTime);

        if (cleaningTime < father){
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.",
                    Math.floor(father - cleaningTime));
        }else {
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.",
                    Math.ceil(cleaningTime - father));
        }

    }
}
