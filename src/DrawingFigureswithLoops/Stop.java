package DrawingFigureswithLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stop {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());



        String firstPart = repeatStr(".", n + 1)
                + repeatStr("_", 2 * n + 1)
                +repeatStr(".", n + 1);
        System.out.println(firstPart);

            int midscount = n * 2 - 1;
        for (int i = 0; i < n; i++) {
            String middlePart = repeatStr(".", n - i)
                    + "//"
                    +repeatStr("_", midscount)
                    +"\\\\"
                    + repeatStr(".", n - i);
            midscount += 2;
            System.out.println(middlePart);

        }
        String midPart = "//"
                + repeatStr("_", 2 * n - 3)
                + "STOP!"
                +repeatStr("_", 2 * n - 3)
                +"\\\\";

        System.out.println(midPart);

        for (int i = 0; i < n; i++) {


            String lowPart = repeatStr(".",  i)
                    +"\\\\"
                    +repeatStr("_",midscount)
                    +"//"
                    +repeatStr(".", i);

            midscount -= 2;
            System.out.println(lowPart);

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
