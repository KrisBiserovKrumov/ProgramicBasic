package DrawingFigureswithLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChristmasTree {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        System.out.println(repeatStr(" ", n + 1 ) + "|" + repeatStr( " ", n + 1));

        for (int i = 0; i < n  ; i++) {
            String middle = repeatStr(" ", n - 1 - i)
                    + repeatStr( "*", 1 + i)
                    + " | "
                    +repeatStr( "*", 1 + i)
                    +repeatStr(" ", n - 1 - i);

            System.out.println(middle);
            
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
