package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LowerOrUpper {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char n = reader.readLine().charAt(0);

        if (n >= 65 && n <= 90 ){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
    }
}
