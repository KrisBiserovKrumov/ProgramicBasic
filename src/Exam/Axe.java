package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Axe {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());


        for (int i = 0; i < n; i++) {
            System.out.print(repeatStr("-", 3 * n));
            System.out.print("*");
            System.out.print(repeatStr("-", i));
            System.out.print("*");
            System.out.println(repeatStr("-", 2 * n - (i + 2)));

            }
        for (int i = 0; i < n / 2 ; i++) {
            System.out.print(repeatStr("*", 3 * n + 1));
            System.out.print(repeatStr("-", n - 1));
            System.out.print("*");
            System.out.println(repeatStr("-", n - 1));

        }
        for (int i = 0; i <= n / 3 ; i++) {
            System.out.print(repeatStr("-", 3 * n - i));
            System.out.print("*");
            System.out.print(repeatStr("-", n - 1 + 2 * i));
            System.out.print("*");
            System.out.println(repeatStr("-", n - 1 - i ));


        }
        System.out.print(repeatStr("-", 3 * n - (n / 2) + 1));
        System.out.print(repeatStr("*", 5 * n - (3 * n - (n / 2) + 1) - ( n - n / 2)) );
        System.out.println(repeatStr("-", n - n /2));

    }

    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
