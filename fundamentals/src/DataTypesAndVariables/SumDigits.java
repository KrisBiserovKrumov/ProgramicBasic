package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String a = reader.readLine();

        int sum = 0;

        for (int i = 0; i < a.length(); i++) {
            sum += a.charAt(i) - '0';

        }
        System.out.println(sum);

    }
}
