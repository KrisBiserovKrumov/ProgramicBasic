package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversedChars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();



        String c = reader.readLine();

        System.out.println("" + c + " " + b + " " + a);

    }
}
