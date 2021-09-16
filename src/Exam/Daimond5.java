package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Daimond5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int h =(3 * n + 2) - (n + 1);
        int a = (5 * n - 3 * n) / 2 ;


        System.out.print(repeatStr(".",a));
        System.out.print(repeatStr("*", n * 3));
        System.out.println(repeatStr(".",a));

        for (int i = 0; i < n - 1 ; i++) {
            a--;
            System.out.print(repeatStr(".", a));
            System.out.print("*");
            System.out.print(repeatStr(".", 5 * n - (2 * a) - 2));
            System.out.print("*");
            System.out.println(repeatStr(".", a));

            
        }
        System.out.println(repeatStr( "*", 5 * n));

        for (int i = 1; i <= h - 1; i++) {
            int last = 5 * n - 2 - 2 * i;
            System.out.print(repeatStr(".", i));
            System.out.print("*");
            System.out.print(repeatStr(".", last));
            System.out.print("*");
            System.out.println(repeatStr(".", i));


            
        }
        System.out.print(repeatStr(".", 2 * n +1));
        System.out.print(repeatStr("*", 5 * n - 2 * ( 2 * n + 1)));
        System.out.println(repeatStr(".", 2 * n +1));
        
        
        
        
        
        }

    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
