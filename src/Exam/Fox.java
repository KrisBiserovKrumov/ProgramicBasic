package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fox {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int form = 2 * n + 3;

        for (int i = 1; i <= n; i++) {

            System.out.print(repeatStr("*", i));
            System.out.print("\\");
            System.out.print(repeatStr("-", form - 2* i - 2));
            System.out.print("/");
            System.out.println(repeatStr("*", i));
        }
        for (int i = 0; i < n / 3; i++) {
            System.out.print("|");
            System.out.print(repeatStr("*", (form -  4 - n)/ 2 + i));
            System.out.print("\\");
            System.out.print(repeatStr("*",n - 2 * i));
            System.out.print("/");
            System.out.print(repeatStr("*", (form - 4 - n) / 2  + i));
            System.out.println("|");

            }
        for (int i = 1; i <= n; i++) {

            System.out.print(repeatStr("-", i));
            System.out.print("\\");
            System.out.print(repeatStr("*", form - 2* i - 2));
            System.out.print("/");
            System.out.println(repeatStr("-", i));
        }
        
        
    }

    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
