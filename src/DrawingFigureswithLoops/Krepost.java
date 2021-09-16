package DrawingFigureswithLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Krepost {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String FirstPart = "/"
                + repeatStr("^", n / 2)
                +"\\"
                + repeatStr("_", n * 2 - ((n / 2 + 2) * 2))
                + "/"
                + repeatStr("^", n / 2)
                + "\\";
        System.out.println(FirstPart);

        for (int i = 0; i <n - 3 ; i++) {
            String middPart = "|"
                    + repeatStr(" ", 2 * n - 2)
                    + "|";
            System.out.println(middPart);
            }
            String lowPart = "|"
                    +repeatStr(" ", n / 2 + 1)
                    +repeatStr("_", n * 2 - ((n / 2 + 2)* 2))
                    + repeatStr(" ", n / 2 + 1)
                    +"|";
        System.out.println(lowPart);

        String LowestPart = "\\"
                + repeatStr("_", n / 2)
                +"/"
                + repeatStr(" ", n * 2 - ((n / 2 + 2) * 2))
                + "\\"
                + repeatStr("_", n / 2)
                + "/";
        System.out.println(LowestPart);

    }

    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
