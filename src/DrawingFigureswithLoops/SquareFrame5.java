package DrawingFigureswithLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareFrame5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String firstAndLastRow = "+"
                + repeatStr(" -", n - 2)
                + " +";
        System.out.println(firstAndLastRow);

        for (int i = 0; i < n - 2 ; i++) {
            System.out.println("|"
                    + repeatStr(" -", n - 2)
                    + " |");
        }
        System.out.println(firstAndLastRow);
    }

    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
