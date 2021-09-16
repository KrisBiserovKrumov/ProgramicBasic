package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumbLime {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int wedth = 2 * n;

        for (int i = 1; i <=  n; i++) {
            System.out.print(repeatStr(" ", wedth  - 2 * i));
            System.out.println(repeatStr("*", 2 * i));
            }
        System.out.println(repeatStr( "*", wedth - 2));
        System.out.println(repeatStr( "*", wedth - 4));
        System.out.println(repeatStr( "*", wedth - 2));
        for (int i = 0; i < 3; i++) {
            System.out.print(repeatStr(" ", 2 * i));
            System.out.println(repeatStr("*", wedth - 2 * i));

        }
        System.out.print(repeatStr(" ", 2));
        System.out.println(repeatStr("*", wedth - 2));

        for (int i = 0; i < n  ; i++) {
            System.out.print( repeatStr("*", wedth - 2 * i));
            System.out.println(repeatStr(" " , 2 * i));


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
