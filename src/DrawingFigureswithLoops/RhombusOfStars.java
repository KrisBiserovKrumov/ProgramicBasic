package DrawingFigureswithLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RhombusOfStars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());


        for (int i = 1; i <= n; i++) {
            String firstPart = repeatStr(" ", n - i)
                    + repeatStr("* ", i);
            System.out.println(firstPart);


        }
        for (int i = 1; i < n; i++) {
            String SecondPart = repeatStr(" ", i)
                    + repeatStr("* ", n - i);
            System.out.println(SecondPart);

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
