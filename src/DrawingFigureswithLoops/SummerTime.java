package DrawingFigureswithLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummerTime {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        String firstLow = repeatStr(" ", n / 2)
                + repeatStr("*", n + 1);
        System.out.println(firstLow);

        for (int i = 0; i < n / 2; i++) {


            String secundLow = repeatStr(" ", n / 2)
                    + "*"
                    + repeatStr(" ", n - 1)
                    + "*";
            System.out.println(secundLow);
        }
        for (int i = 0; i < n / 2; i++) {
            String middlePart = repeatStr(" ", n / 2 - i)
                    + "*"
                    +repeatStr(" ", n - 1 + 2 * i)
                    + "*"
                    + repeatStr(" ", n /2 - i);
            System.out.println(middlePart);
            
        }
        for (int i = 0; i < n; i++) {

            String middlePart2 = "*"
                    + repeatStr(".", 2 * n - 2)
                    + "*";
            System.out.println(middlePart2);

        }
        for (int i = 0; i < n; i++) {

            String middlePart2 = "*"
                    + repeatStr("@", 2 * n - 2)
                    + "*";
            System.out.println(middlePart2);

        }
        System.out.println(repeatStr("*", n * 2));



    }

    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
