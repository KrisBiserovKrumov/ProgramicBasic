package ExamFinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NightLamp {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int h = 2 * n + 8;
        int wedth = 4 * n + 11;
// first
        System.out.print(repeatStr(".", (wedth - (3 + 2 * n)) / 2));
        System.out.print(repeatStr("_", n));
        System.out.print("/|\\");
        System.out.print(repeatStr("_", n));
        System.out.println(repeatStr(".", (wedth - (3 + 2 *n)) / 2));
        //second
        System.out.print(repeatStr(".", (wedth - (3 + 2 * n)) / 2));
        System.out.print("/");
        System.out.print(repeatStr("-", wedth - (wedth - (1 + 2 * n)) ));
        System.out.print("\\");
        System.out.println(repeatStr(".", (wedth - (3 + 2 * n)) / 2));
        //There

        for (int i = 1; i <= 3; i++) {
            System.out.print(repeatStr(".", ((wedth - (3 + 2 * n)) / 2) - i));
            System.out.print("/");
            System.out.print(repeatStr(".", (wedth - (wedth - (1 + 2 * n))) + 2 * i ));
            System.out.print("\\");
            System.out.println(repeatStr(".", ((wedth - (3 + 2 * n)) / 2) - i));

            }
            //four
        System.out.print(repeatStr(".", n));
        System.out.print("/");
        System.out.print(repeatStr("_", wedth - (2 * n + 2)));
        System.out.print("\\");
        System.out.println(repeatStr(".", n));

        //five
        for (int i = 1; i <= n - 2 ; i++) {
            System.out.print(repeatStr(".", n - i));
            System.out.print("/");
            System.out.print(repeatStr(".", wedth - 2 * n - 2 + 2 * i));
            System.out.print("\\");
            System.out.println(repeatStr(".", n - i));

            }
            //six
        System.out.print(".");
        System.out.print("/");
        System.out.print(repeatStr("_", wedth  - 4));
        System.out.print("\\");
        System.out.println(".");
        // seven
        System.out.print("/");
        System.out.print(repeatStr("_", wedth  - 2));
        System.out.println("\\");
        //eight

        for (int i = 0; i < n ; i++) {
            System.out.print(repeatStr(".", (wedth - 3) / 2));
            System.out.print("|$|");
            System.out.println(repeatStr(".", (wedth - 3) / 2));

        }
        // nine
        System.out.print(repeatStr(".", 4));
        System.out.print(repeatStr("_", 2 * n ));
        System.out.print("|$|");
        System.out.print(repeatStr("_", 2 * n ));
        System.out.println(repeatStr(".", 4));
        // ten
        System.out.print(repeatStr(".", 3));
        System.out.print("/");
        System.out.print(repeatStr("_", wedth - 8 ));
        System.out.print("\\");
        System.out.println(repeatStr(".", 3));












    }

    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
