package DrawingFigureswithLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Daimond {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int stars = 0;
        int rows = 0;

        if (n % 2 == 0){
            stars = 2;
            rows = n - 1;
        }else {
            stars = 1;
            rows = n;
        }
        int formula = (n - stars) / 2;

        String firstPart = repeatStr("-", formula)
                + repeatStr("*", stars)
                + repeatStr("-",formula);

        System.out.println(firstPart);
        formula--;

        int middPart = n - (2 * formula) - 2;

        for (int i = 0; i < (rows - 1) / 2; i++) {

            System.out.print(repeatStr("-",formula));
            System.out.print("*");
            System.out.print(repeatStr("-",middPart));
            System.out.print("*");
            System.out.println(repeatStr("-",formula));
            formula--;
            middPart += 2;
        }
        formula+=2;
        middPart -= 4;

        for (int i = 0; i < (rows - 1) / 2 - 1 ; i++) {
            System.out.print(repeatStr("-", formula));
            System.out.print("*");
            System.out.print(repeatStr("-", middPart));
            System.out.print("*");
            System.out.println(repeatStr("-", formula));

            formula++;
           middPart -= 2;

           }
           if (n > 2){
            System.out.println(firstPart);
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
