package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rocket5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int form = 3 * n;



        for (int i = 0; i < n; i++){
            System.out.print(repeatStr(".", (form - 2) / 2 - i));
            System.out.print("/");
            System.out.print(repeatStr(" ", 2 * i));
            System.out.print("\\");
            System.out.println(repeatStr(".", (form - 2) / 2 - i));

            }
        System.out.print(repeatStr(".", n / 2));
        System.out.print(repeatStr("*", form - n));
        System.out.println(repeatStr(".", n / 2));

        for (int i = 0; i < n * 2 ; i++) {

            System.out.print(repeatStr(".", n / 2));
            System.out.print("|");
            System.out.print(repeatStr("\\", form - n - 2));
            System.out.print("|");
            System.out.println(repeatStr(".", n / 2));

            }
        for (int i = 0; i < n / 2; i++) {
            System.out.print(repeatStr(".", n / 2 - i));
            System.out.print("/");
            System.out.print(repeatStr("*", form - n - 2 + 2 * i));
            System.out.print("\\");
            System.out.println(repeatStr(".", n / 2 - i));


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
