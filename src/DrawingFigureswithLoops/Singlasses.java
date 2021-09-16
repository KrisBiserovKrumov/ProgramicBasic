package DrawingFigureswithLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Singlasses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        String firstAndLast = repeatStr("*", 2 * n)
                + repeatStr(" ", n)
                + repeatStr("*", 2 * n);

        System.out.println(firstAndLast);
        
        //MidPart

        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");

            for (int j = 0; j <n * 2 - 2; j++) {
                System.out.print("/");
            }
            System.out.print("*");
            if (i == (n - 1) / 2 - 1){
                for (int j = 0; j < n ; j++) {
                    System.out.print("|");

                }
            }else {
                for (int j = 0; j <n ; j++) {
                    System.out.print(" ");

                }
            }
            System.out.print("*");

            for (int j = 0; j < n * 2 - 2; j++) {
                System.out.print("/");
                
            }
            System.out.println("*");
        }
        System.out.println(firstAndLast);



    }

    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
