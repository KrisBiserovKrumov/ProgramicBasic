package DrawingFigureswithLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class House {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int stars = 0;
        if (n % 2 == 0){
            stars = 2;
        }else {
            stars = 1;
        }



        for (int i = 1; i <= (n + 1) / 2 ; i++) {
            String firstPart = repeatStr("-",(n - stars) / 2)
                    + repeatStr("*" , stars)
                    + repeatStr("-", (n - stars) / 2);
            stars +=2;
            System.out.println(firstPart); 
        }
        for (int i = 0; i < n / 2; i++) {
            String secondPart = "|"
                    + repeatStr("*", n - 2)
                    +"|";
            System.out.println(secondPart);

            
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
