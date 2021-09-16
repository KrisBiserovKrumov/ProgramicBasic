package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChristmasHat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int wedth = 4 * n + 1;
        int h = 2 * n + 5;


            System.out.print(repeatStr(".", (wedth - 3) / 2 ));
            System.out.print("/|\\");
            System.out.println(repeatStr(".", (wedth - 3) / 2 ));

        System.out.print(repeatStr(".", (wedth - 3) / 2 ));
        System.out.print("\\|/");
        System.out.println(repeatStr(".", (wedth - 3) / 2 ));

        System.out.print(repeatStr(".", (wedth - 3) / 2 ));
        System.out.print("***");
        System.out.println(repeatStr(".", (wedth - 3) / 2 ));

        for (int i = 0; i < h - 6 ; i++) {
            System.out.print(repeatStr(".", (wedth - 5) / 2 - i));
            System.out.print("*");
            System.out.print(repeatStr("-", i + 1));
            System.out.print("*");
            System.out.print(repeatStr("-", i + 1));
            System.out.print("*");
            System.out.println(repeatStr(".", (wedth - 5) / 2 - i));

            }
        System.out.println(repeatStr("*", wedth));

        System.out.print("*");
        System.out.println(repeatStr(".*", wedth / 2 ));

        System.out.println(repeatStr("*", wedth));








    }

    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
